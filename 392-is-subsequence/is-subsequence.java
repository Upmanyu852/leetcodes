class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;  // pointer for s
        int j = 0;  // pointer for t

        // Move through both strings
        while (i < s.length() && j < t.length()) {

            // If characters match, move s pointer forward
            if (s.charAt(i) == t.charAt(j)) {
                i++;  // found this character, look for next one in s
            }

            // Always move t pointer forward
            j++;
        }

        // If i reached end of s, all characters were found in order
        return i == s.length();
    }
}