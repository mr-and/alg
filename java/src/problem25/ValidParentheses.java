package problem25;

import java.util.Stack;

public class ValidParentheses {
    private static boolean isValid(String parentheses) {
        if (parentheses == null || (parentheses.length() % 2 != 0)) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (Character c : parentheses.toCharArray()) {
            if(c == '(') stack.push(')');
            else if(c == '{') stack.push('}');
            else if(c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}
