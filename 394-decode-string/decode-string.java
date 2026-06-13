/*
import java.util.Stack;

Stack<Integer> numStack = new Stack<>();
Stack<String> strStack = new Stack<>();

numStack.push(3);           // add to top
int top = numStack.pop();   // remove and return top → 3
int peek = numStack.peek(); // see top without removing
numStack.isEmpty();         // true if empty

FOR STRING 

StringBuilder sb = new StringBuilder();
sb.append("abc");           // add to end
sb.toString();              // convert to String

// Repeat a string manually
StringBuilder repeated = new StringBuilder();
for (int i = 0; i < 3; i++) {
    repeated.append("ab");
}
// repeated = "ababab"

*/

import java.util.*;

class Solution {

    public String decodeString(String s) {

        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        int i = 0;

        while (i < s.length()) {

            char ch = s.charAt(i);

            // If digit
            if (Character.isDigit(ch)) {

                int num = 0;

                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                numberStack.push(num);
                continue;
            }

            // If not ']'
            else if (ch != ']') {

                stringStack.push(String.valueOf(ch));
            }

            // If ']'
            else {

                String temp = "";

                while (!stringStack.peek().equals("[")) {
                    temp = stringStack.pop() + temp;
                }

                stringStack.pop(); // remove '['

                int repeat = numberStack.pop();

                String repeated = "";

                for (int j = 0; j < repeat; j++) {
                    repeated += temp;
                }

                stringStack.push(repeated);
            }

            i++;
        }

        String result = "";

        while (!stringStack.isEmpty()) {
            result = stringStack.pop() + result;
        }

        return result;
    }
}