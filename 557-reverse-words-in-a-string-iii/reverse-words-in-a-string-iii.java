// brute force approch
/*class Solution {

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
}*/
class Solution {

    public String reverseWords(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = 0;

        while (right < arr.length) {

            if (arr[right] == ' ') {
                reverse(arr, left, right - 1);
                left = right + 1;
            }

            right++;
        }

        // Reverse the last word
        reverse(arr, left, right - 1);

        return new String(arr);
    }

    private void reverse(char[] arr, int left, int right) {

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}