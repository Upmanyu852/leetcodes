class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        int n = s.size();

        if (n % 2 == 1) {
            return false;
        }

        for (int i = 0; i < n; i++) {

            if (s[i] == '(' || s[i] == '{' || s[i] == '[') {
                st.push(s[i]);
            } else {
                if (!st.size()) {
                    return false;
                } else if ((s[i] == ')' && st.top() == '(') ||
                           (s[i] == '}' && st.top() == '{') ||
                           (s[i] == ']' && st.top() == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        if (st.size()) {
            return false;
        }

        return true;
    }
};