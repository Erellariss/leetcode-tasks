package leetcode;

import java.util.Stack;

import static java.lang.Character.isDigit;

public class _394_DecodeString {

    public String decodeString(String s) {
//        return new RecursiveSolution().decodeString(s);
        return StackSolution.decodeString(s);
    }

    private static final class RecursiveSolution {
        private int i = 0;

        public String decodeString(String s) {
            int n = s.length();
            StringBuilder result = new StringBuilder();
            while (i < n && s.charAt(i) != ']') {
                var c = s.charAt(i);
                if (isDigit(c)) {
                    int k = c - '0';
                    i++;
                    while (isDigit(s.charAt(i))) {
                        k = k * 10 + s.charAt(i++) - '0';
                    }
                    i++; // skip '['
                    String decodedSubString = decodeString(s);
                    i++; // skip ']'
                    while (k-- > 0) {
                        result.append(decodedSubString);
                    }
                } else {
                    result.append(c);
                    i++;
                }
            }
            return result.toString();
        }
    }

    private static final class StackSolution {
        private static String decodeString(String s) {
            Stack<Integer> kStack = new Stack<>();
            Stack<String> resultStack = new Stack<>();
            int i = 0, n = s.length();
            StringBuilder currentString = new StringBuilder();
            while (i < n) {
                char c = s.charAt(i);
                if (isDigit(c)) {
                    int k = 0;
                    while (i < n && isDigit(s.charAt(i))) {
                        k = k * 10 + (s.charAt(i++) - '0');
                    }
                    i++; // skip [
                    kStack.push(k);
                    resultStack.push(currentString.toString());
                    currentString = new StringBuilder();
                } else if (c == ']') {
                    int repeatTimes = kStack.pop();
                    var temp = new StringBuilder(resultStack.pop());
                    while (repeatTimes-- > 0) {
                        temp.append(currentString);
                    }
                    currentString = temp;
                    i++;
                } else {
                    currentString.append(c);
                    i++;
                }
            }
            return currentString.toString();
        }
    }
}
