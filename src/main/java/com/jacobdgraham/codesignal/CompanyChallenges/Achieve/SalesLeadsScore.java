package com.jacobdgraham.codesignal.CompanyChallenges.Achieve;

import java.util.Arrays;
import java.util.Comparator;

public final class SalesLeadsScore {
    
    /**
        You are provided the following information about sales leads:

        An array of names, where names[i] is the name of the ith sales lead.
        An array of times in the system, where time[i] is the time spend for work during the year (in days) for ith sales lead.
        An array of net values, where netValue[i] is the net value of the ith sales lead.
        An array of vacation statuses, where isOnVacation[i] shows if the ith sales lead is on vacation or not.

        Your task is to return the sales leads in decreasing order of their score. Only sales leads not on vacation should be returned. The score for the ith lead is 
        calculated as netValue[i] * time[i] / 365. In case of equal scores, the lead with greater time should go first. In case of equal scores and times, the lead with the 
        lexicographically smaller name should go first.

        It's guaranteed that at least one isOnVacation[i] is false.
        * @param names an array of Strings containing the names of the sales leads
        * @param time an array of integers containing the total amount of work time during the year (in days) 
        * @param netValue an array of integers containing the total value netted by a sales lead
        * @param isOnVacation an array of boolean containing whether the sales lead at i is on vacation
        * @return an array of sorted sales lead names based on the rules defined below:
        (1). If the scores are not equal, we will compare the scores to see which is larger and place the larger sales lead name first. 
        (2). If the scores are equal but the times are not equal, we must see which sales lead has the higher time and place that sales lead first. 
        (3). If both the score and time are equal, we must compare the sales lead names based on the natural ordering of their names and place the sales lead with the most 
        natural ordering of their name first.
    */
    final String[] solution(String[] names, int[] time, int[] netValue, boolean[] isOnVacation) {
        /*
         * The problem defines that if the names[] array has values, then it follows the other arrays must also have an equal amount of values.
         * Therefore, we must only test the 'names' array for values. 
         */
        if (names.length == 0 || names == null) {
            return null;
        }

        Integer[] salesLeadFigures = new Integer[names.length];
        int salesLeadNotOnVacation = 0;
        
        for (int i = 0; i < names.length; i++) {
            salesLeadFigures[i] = i;
        }
        
        for (int i = 0; i < isOnVacation.length; i++) {
            if (!isOnVacation[i]) {
                salesLeadNotOnVacation++;
            }
        }
        
        String[] salesLeadNamesDecreasingScore = new String[salesLeadNotOnVacation];
        
        Arrays.sort(salesLeadFigures, new Comparator<Integer>() {
        public int compare(Integer i, Integer j) {
            double scoreI = (double)(netValue[i] * time[i]) / 365;
            double scoreJ = (double)(netValue[j] * time[j]) / 365;
            /*
            (1). If the scores are not equal, we will compare the scores to see which is larger. 
            (2). If the scores are equal but the times are not equal, we must see which sales lead has the higher time.
            (3). If both the score and time are equal, we must compare the sales lead names based on the natural ordering of their names
            */
            if (scoreI != scoreJ) {
                    return Double.compare(scoreJ, scoreI);         
            } else if (time[i] != time[j]) {
                    return Integer.compare(time[j], time[i]);
            } else {
                return names[i].compareTo(names[j]);
            }
        } 
        });
        
        int traversalIndex = 0;
        for (int salesLead : salesLeadFigures) {
            if (!isOnVacation[salesLead]) {
                salesLeadNamesDecreasingScore[traversalIndex++] = names[salesLead];
            }
        }
        
        return salesLeadNamesDecreasingScore;
    }
}
