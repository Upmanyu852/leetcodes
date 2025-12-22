class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        String m = "";
        String k = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                m = m + s.charAt(i);
            }
        }

        for (int i = m.length() - 1; i >= 0; i--) {
            k = k + m.charAt(i);
        }

        return m.equals(k);
    }
}
