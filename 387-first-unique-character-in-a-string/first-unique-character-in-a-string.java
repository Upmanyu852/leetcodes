class Solution {
    public int firstUniqChar(String s) {

        // Step 1: Create frequency array for 26 letters
        int[] freq = new int[26];

        // Step 2: Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 3: Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i; // return index
            }
        }

        return -1; // no unique character
    }
}