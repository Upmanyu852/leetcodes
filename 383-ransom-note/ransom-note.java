class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // Step 1: Count letters in magazine
        int[] magFreq = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            magFreq[magazine.charAt(i) - 'a']++;
        }

        // Step 2: Count letters in ransomNote
        int[] noteFreq = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            noteFreq[ransomNote.charAt(i) - 'a']++;
        }

        // Step 3: Check if magazine can cover ransomNote
        for (int i = 0; i < 26; i++) {
            if (noteFreq[i] > magFreq[i]) {
                return false; // need more than available
            }
        }

        return true;
    }
}
//APPROACH B
/*
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // Single frequency array for all 26 letters
        int[] freq = new int[26];

        // Count UP for magazine (available letters)
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }

        // Count DOWN for ransomNote (needed letters)
        for (int i = 0; i < ransomNote.length(); i++) {
            freq[ransomNote.charAt(i) - 'a']--;

            // If count goes negative → not enough of this letter
            if (freq[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
*/