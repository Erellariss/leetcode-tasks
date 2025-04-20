package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class _239_SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] answer = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
            if (i >= k - 1) {
                answer[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return answer;
    }
}
