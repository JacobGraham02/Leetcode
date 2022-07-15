package com.jacobdgraham.leetcode.Easy;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } 
        if (strs.length == 1) {
            return strs[0];
        }
        String currentPrefix = strs[0];
        int prefixCharCounter = 0;
        String prefixComparisonString = "";
        
        for (int i = 1; i < strs.length; i++) {
            prefixCharCounter = 0;
            prefixComparisonString = strs[i];
            
            while (prefixCharCounter < currentPrefix.length() && 
                prefixCharCounter < prefixComparisonString.length() &&
                currentPrefix.charAt(prefixCharCounter) == prefixComparisonString.charAt(prefixCharCounter))                {
                prefixCharCounter++; 
            }
            currentPrefix = currentPrefix.substring(0, prefixCharCounter);
        }
        return currentPrefix;
    }
}