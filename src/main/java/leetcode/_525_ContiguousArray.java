package leetcode;

import java.util.HashMap;

public class _525_ContiguousArray {
    public int findMaxLength(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        int zeros = 0, ones = 0, maxLen = 0;

        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zeros++;
            else ones++;
            int diff = zeros - ones;

            if (map.containsKey(diff)) {
                maxLen = Math.max(maxLen, i - map.get(diff));
            } else {
                map.put(diff, i);
            }
        }
        return maxLen;
    }
}
