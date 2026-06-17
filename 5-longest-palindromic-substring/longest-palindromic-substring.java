class Solution {

    public String longestPalindrome(String s) {

        if (s.length() <= 1)
            return s;

        String lps = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int low = i, high = i;

            while (low >= 0 && high < s.length()
                    && s.charAt(low) == s.charAt(high)) {

                low--;
                high++;
            }

            String palindrome = s.substring(low + 1, high);

            if (palindrome.length() > lps.length()) {
                lps = palindrome;
            }

            // Even length palindrome
            low = i;
            high = i + 1;

            while (low >= 0 && high < s.length()
                    && s.charAt(low) == s.charAt(high)) {

                low--;
                high++;
            }

            palindrome = s.substring(low + 1, high);

            if (palindrome.length() > lps.length()) {
                lps = palindrome;
            }
        }

        return lps;
    }
}