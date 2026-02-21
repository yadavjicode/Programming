package string;

import java.util.Stack;
/*
Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false


*/

class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("[](){"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            System.out.print(i + "--" + s.charAt(i));
            if (stack.isEmpty()) {

                stack.add(s.charAt(i));

            } else {
                // '('')', '{''}', '['']',
                if (stack.lastElement() == '(' && s.charAt(i) == ')' || stack.lastElement() == '{' && s.charAt(i) == '}'
                        || stack.lastElement() == '[' && s.charAt(i) == ']') {
                    stack.pop();
                } else {
                    stack.add(s.charAt(i));
                }
            }
        }

        return stack.isEmpty();

    }

}
