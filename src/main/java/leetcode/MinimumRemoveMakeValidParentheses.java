package leetcode;

import java.util.Stack;

public class MinimumRemoveMakeValidParentheses {

    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == ')') {
                if (!stack.isEmpty()) {
                    result.append(c);
                    stack.pop();
                }
            } else if (c == '(') {
                    result.append(c);
                    stack.push(result.length() - 1);
            } else {
                result.append(c);
            }
        }
        while (!stack.isEmpty()) {
            result.deleteCharAt(stack.pop());
        }

        return result.toString();
    }
}
