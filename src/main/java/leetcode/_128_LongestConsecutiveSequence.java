package leetcode;

import java.util.HashSet;
import java.util.Set;

public class _128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for (int num : nums) {
            if (set.contains(num - 1)) {
                continue;
            }
            int count = 1;
            while (set.contains(++num)) {
                count++;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
