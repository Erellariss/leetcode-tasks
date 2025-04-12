package leetcode;

public class _53_MaximumSubarray {

    public int maxSubArray(int[] nums) {
        return maxSubArrayKadane(nums);
    }

    private int maxSubArrayKadane(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int num : nums) {
            currentSum = Math.max(0, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
