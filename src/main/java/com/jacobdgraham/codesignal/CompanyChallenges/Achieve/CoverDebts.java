package com.jacobdgraham.codesignal.CompanyChallenges.Achieve;

public final class CoverDebts {
    
    final double coverDebtsBruteForce(int s, double[] debts, double[] interests) {
        if (debts == null || debts.length == 0) {
            return 0.0;
        }
        if (s == 0) {
            return 0.0;
        }
        double totalMoneySpent = 0;
        double maximumMonthlyPayment = s * 0.10;
        int maximumInterestIndex = 0;
        
        while (maximumInterestIndex != -1) {
            maximumInterestIndex = -1;
            for (int i = 0; i < interests.length; i++) {
                if (debts[i] > 0 && (maximumInterestIndex == -1 || interests[i] > interests[maximumInterestIndex])) {
                    maximumInterestIndex = i;
                }
            }
            
            if (maximumInterestIndex == -1) {
                break;
            }
            
            if (debts[maximumInterestIndex] <= maximumMonthlyPayment) {
                totalMoneySpent += debts[maximumInterestIndex];
                maximumMonthlyPayment -= debts[maximumInterestIndex];
                debts[maximumInterestIndex] = 0;
            } else {
                totalMoneySpent += maximumMonthlyPayment;
                debts[maximumInterestIndex] -= maximumMonthlyPayment;
                maximumMonthlyPayment = 0;
            }
            
            if (maximumMonthlyPayment == 0) {
                for (int i = 0; i < debts.length; i++) {
                    debts[i] += debts[i] * (interests[i] / 100.0);
                }
                maximumMonthlyPayment = s * 0.10;
            }
        }
        return totalMoneySpent;
    }
}
