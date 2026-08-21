class Solution {
    public int longestSubstring(String s, int k) {
        return solve(s, k, 0, s.length() - 1);
    }

    public int solve(String s, int k, int left, int right) {

        // Count frequency of characters
        int[] freq = new int[26];

        for (int i = left; i <= right; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find a character whose frequency is less than k
        for (int i = 0; i < 26; i++) {

            if (freq[i] > 0 && freq[i] < k) {

                char bad = (char) ('a' + i);

                int ans = 0;
                int start = left;

                // Split the string around the bad character
                for (int j = left; j <= right; j++) {

                    if (s.charAt(j) == bad) {

                        ans = Math.max(
                            ans,
                            solve(s, k, start, j - 1)
                        );

                        start = j + 1;
                    }
                }

                // Check the part after the last bad character
                ans = Math.max(
                    ans,
                    solve(s, k, start, right)
                );

                return ans;
            }
        }

        // No character has frequency less than k
        // Therefore, the entire substring is valid
        return right - left + 1;
    }
}