package leetcode._402;

import java.util.Stack;

/**
 * todo
 */
class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length()) {
            return "0";
        }
        if (k == 0) {
            return num;
        }
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < num.length()) {


            stack.push(num.charAt(i++));
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}