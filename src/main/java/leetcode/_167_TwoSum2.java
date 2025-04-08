package leetcode;

public class _167_TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        var n = numbers.length;
        int left = 0, right = n - 1;
        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            }
        }
        return new int[]{++left, ++right};
    }
}
