package leetcode;

public class _560_SubarrayEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0, n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == k) {
                count++;
            }
            for (int j = i + 1; j < n; j++) {
                if (nums[j] - nums[i] == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
