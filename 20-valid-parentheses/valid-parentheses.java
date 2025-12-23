class Solution {
    public boolean isValid(String s) {

        // Array to act as stack
        char[] stack = new char[s.length()];
        int top = -1;   // stack empty

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If opening bracket → push
            if (ch == '(' || ch == '{' || ch == '[') {
                top++;
                stack[top] = ch;
            }
            else {
                // If closing bracket and stack empty
                if (top == -1) return false;

                char last = stack[top];
                top--;  // pop

                // Check matching
                if ((ch == ')' && last != '(') ||
                    (ch == '}' && last != '{') ||
                    (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }

        // If stack empty → valid
        return top == -1;
    }
}
