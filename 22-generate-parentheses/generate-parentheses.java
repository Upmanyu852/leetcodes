class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backtrack(
        List<String> result,
        StringBuilder current,
        int open,
        int close,
        int n
    ) {
        // Base case: used all n pairs → valid combination complete!
        if (open == n && close == n) {
            result.add(current.toString());
            return;
        }

        // Choice 1: Add '(' if we still have opening brackets left
        if (open < n) {
            current.append('(');           // CHOOSE
            backtrack(result, current, open + 1, close, n);  // EXPLORE
            current.deleteCharAt(current.length() - 1);      // UNCHOOSE
        }

        // Choice 2: Add ')' if it won't exceed opening brackets
        if (close < open) {
            current.append(')');           // CHOOSE
            backtrack(result, current, open, close + 1, n);  // EXPLORE
            current.deleteCharAt(current.length() - 1);      // UNCHOOSE
        }
    }
}