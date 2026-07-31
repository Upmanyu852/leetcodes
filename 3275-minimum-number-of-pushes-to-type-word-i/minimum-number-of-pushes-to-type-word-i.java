class Solution {
    public int minimumPushes(String word) {

        // Word ki total length nikal lo
        int n = word.length();

        // Final answer store karne ke liye
        int count = 0;

        // Agar letters 8 ya usse kam hain
        // Har letter sirf 1 push lega
        if (n <= 8) {
            count = n;
        }

        // Agar letters 9 se 16 ke beech hain
        // Pehle 8 letters = 1 push each
        // Baaki letters = 2 push each
        else if (n <= 16) {
            count = 8 + (n - 8) * 2;
        }

        // Agar letters 17 se 24 ke beech hain
        // Pehle 16 letters ka total = 24 pushes
        // Baaki letters = 3 push each
        else if (n <= 24) {
            count = 24 + (n - 16) * 3;
        }

        // Agar letters 24 se zyada hain
        // Pehle 24 letters ka total = 48 pushes
        // Baaki letters = 4 push each
        else {
            count = 48 + (n - 24) * 4;
        }

        // Final minimum pushes return kar do
        return count;
    }
}