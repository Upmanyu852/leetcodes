/*class Solution {
    public int strStr(String haystack, String needle) {

        int m = needle.length();

        for (int i = 0; i <= haystack.length() - m; i++) {

            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}*/
class Solution {
    public int strStr(String haystack, String needle) {

        int h = haystack.length();
        int n = needle.length();

        // Edge case: needle longer than haystack
        if (n > h) return -1;

        // Slide window across haystack
        for (int i = 0; i <= h - n; i++) {

            // Extract substring of same length as needle
            String window = haystack.substring(i, i + n);

            // Compare with needle
            if (window.equals(needle)) {
                return i;  // found! return starting index
            }
        }

        return -1;  // never matched
    }
}