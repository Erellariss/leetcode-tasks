package leetcode;

import java.util.Stack;

public class _739_DailyTemperatures {
    public int[] dailyTemperatures(int[] temps) {
        Stack<Integer> stack = new Stack<>(); // monotonic decreasing stack to find greater value.
        int n = temps.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }
}
