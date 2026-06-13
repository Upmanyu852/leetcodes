// brute force approch
class Solution {

    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String reverseWords(String s) {

        s = s + " ";      // Add extra space to process last word
        String ans = "";
        int k = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {

                ans += reverseString(s.substring(k, i));

                if (i != s.length() - 1) {
                    ans += " ";
                }

                k = i + 1;
            }
        }

        return ans;
    }
}