package leetcode;

import java.util.Stack;

public class _32_LongestValidParentheses {
    public int longestValidParentheses(String s) {
        return pointersBasedSolution(s);
//        return stackBasedSolution(s);
    }

    private static int pointersBasedSolution(String s) {
        int left = 0, right = 0, maxLength = 0;

        // Left to right traversal
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') left++;
            else right++;

            if (left == right) {
                maxLength = Math.max(maxLength, 2 * right);
            } else if (right > left) {
                left = right = 0; // Reset counters
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') left++;
            else right++;

            if (left == right) {
                maxLength = Math.max(maxLength, 2 * left);
            } else if (left > right) {
                left = right = 0; // Reset counters
            }
        }
        return maxLength;
    }

    private static int stackBasedSolution(String s) {
        Stack<Integer> stack = new Stack<>();
        int maxLength = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
                continue;
            }
            stack.pop();
            if (stack.isEmpty()) {
                stack.push(i); // last unmatched ')'
            } else {
                maxLength = Math.max(maxLength, i - stack.peek());
            }
        }
        return maxLength;
    }
}
