import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();

        int mid = n / 2;

        char[] arr = s.toCharArray();

        // Sort only the first half
        Arrays.sort(arr, 0, mid);
        //jo phele sorted array hai use reverse order copy kr rhe hai
        // Copy first half in reverse order to second half
        for (int i = 0; i < mid; i++) {
            arr[n - 1 - i] = arr[i];
        }

        return new String(arr);
    }
}