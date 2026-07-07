class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {

            int bitA = 0;
            int bitB = 0;

            if (i >= 0) {
                bitA = a.charAt(i) - '0';
            }

            if (j >= 0) {
                bitB = b.charAt(j) - '0';
            }

            int result = bitA + bitB + carry;

            sb.append(result % 2);

            carry = result / 2;

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}