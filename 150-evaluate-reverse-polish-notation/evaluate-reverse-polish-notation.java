import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")) {

                int a = stack.pop();
                int b = stack.pop();//remove the elements from stack and store in variable

                int result;

                if (token.equals("+"))
                    result = b + a;
                else if (token.equals("-"))
                    result = b - a;
                else if (token.equals("*"))
                    result = b * a;
                else
                    result = b / a;

                stack.push(result);//push the number in stack

            } else {

                stack.push(Integer.parseInt(token));//converts string to number
            }
        }

        return stack.peek();//last number 
    }
}