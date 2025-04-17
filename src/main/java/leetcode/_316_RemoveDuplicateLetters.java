package leetcode;

import java.util.Stack;

public class _316_RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        return removeDuplicateLettersLastOccurrenceCrazyStack(s);
//        return removeDuplicateLettersCountingChars(s);
    }

    private static String removeDuplicateLettersLastOccurrenceCrazyStack(String s) {
        int[] lastPosition = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastPosition[s.charAt(i) - 'a'] = i;
        }
        boolean[] inStack = new boolean[26];
        char[] stack = new char[26];
        int stackPointer = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (inStack[c -'a']) {
                continue;
            }
            while (stackPointer >= 0
                    && stack[stackPointer] > c
                    && lastPosition[stack[stackPointer] - 'a'] > i) {
                inStack[stack[stackPointer--] - 'a'] = false;
            }
            inStack[(stack[++stackPointer] = c) - 'a'] = true;
        }
        return new String(stack, 0, ++stackPointer);
    }

    private static String removeDuplicateLettersCountingChars(String s) {
        int[] countedChars = new int[256];
        for (char c : s.toCharArray()) {
            countedChars[c]++;
        }
        boolean[] inStack = new boolean[256];
        Stack<Character> resultStack = new Stack<>();
        for (char c : s.toCharArray()) {
            countedChars[c]--;
            if (inStack[c]) {
                continue;
            }
            while (!resultStack.isEmpty()
                    && resultStack.peek() > c
                    && countedChars[resultStack.peek()] > 0) {
                inStack[resultStack.pop()] = false;
            }
            inStack[resultStack.push(c)] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!resultStack.isEmpty()) {
            sb.append(resultStack.pop());
        }
        return sb.reverse().toString();
    }
}
