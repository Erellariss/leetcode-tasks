package leetcode;

//53
public class _53_MaximumSubarray {

    // kadan algo
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxEnding = 0;
        for (int num : nums) {
            max = Math.max(max, maxEnding += num);
            maxEnding = Math.max(0 , maxEnding);
        }
        return max;
    }
}
