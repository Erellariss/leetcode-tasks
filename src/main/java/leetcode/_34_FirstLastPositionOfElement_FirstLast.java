package leetcode;

public class _34_FirstLastPositionOfElement_FirstLast {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{
                findFirst(nums, target),
                findLast(nums, target)
        };
    }

    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (left < nums.length && nums[left] == target) ? left : -1;
    }

    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target >= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (right >= 0 && nums[right] == target) ? right : -1;
    }
}

