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

/* dry run
LeetCode 150 - Evaluate Reverse Polish Notation

Pattern: Stack (Expression Evaluation)

Rule:
Number aaye -> Push
Operator aaye -> 2 values Pop -> Calculate -> Result Push
End me stack ka top = Answer

IMPORTANT:
a = first pop
b = second pop

Result = b operator a

NOT:
a - b
a / b

Always:
b - a
b / a

Dry Run:

Input:
["2","1","+","3","*"]

2  -> [2]

1  -> [2,1]

+  -> pop 1, pop 2
      2+1=3
      push 3
      [3]

3  -> [3,3]

*  -> pop 3, pop 3
      3*3=9
      push 9
      [9]

Answer = 9

Pseudo Logic:

for each token

    if operator
        a = pop()
        b = pop()

        result = b op a

        push(result)

    else
        push(Integer.parseInt(token))

return stack.peek()

Common Trap:

Input:
["4","2","-"]

Stack:
[4,2]

a = pop() = 2
b = pop() = 4

Answer:
b-a = 4-2 = 2

NOT:
a-b = 2-4 = -2

Complexity:
Time  = O(n)
Space = O(n)

One Line Memory:
Number -> Push
Operator -> Pop 2 -> b op a -> Push
Top of Stack = Answer*/