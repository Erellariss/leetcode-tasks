package leetcode;

public class _152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int localMax, localMin, globalMax;
        localMax = localMin = globalMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int currentMin = localMin;
            localMin = Math.min(num, Math.min(num * localMin, num * localMax));
            localMax = Math.max(num, Math.max(num * currentMin, num * localMax));
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
}
