package com.jacobdgraham.leetcode;

public final class MaximumNumberOfVowelsInSubstringOfGivenString {
    public int maxVowels(String s, int k) {
        if (k > s.length()) {
            return 0;
        }
        int vowelCountForSlidingWindow = 0;
        int maximumVowelCount = 0;

        /*
        We will first calculate the number of voewls in the initial sliding window to see if can terminate execution
        of the algorithm early
        */
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelCountForSlidingWindow++;
            }
        }
        maximumVowelCount = vowelCountForSlidingWindow;
        /*
        If there is an additional vowel inside of the sliding window, we must increment the vowel count.
        However, because we are continuously moving the end window pointer one spot to the right, we end up with
        vowels counted from old pointer locations that are no longer current. Because of this, after we increment any pointer,
        we must determine if the previously-held pointer location has a vowel. If it does, we must subtract 1
        from the total to account for that vowel.
        */
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowelCountForSlidingWindow++;
            }
            if (isVowel(s.charAt(i-k))) {
                vowelCountForSlidingWindow--;
            }
            maximumVowelCount = Math.max(maximumVowelCount, vowelCountForSlidingWindow);
        }
        return maximumVowelCount;
    }

    private boolean isVowel(final char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } 
        return false;
    }
}