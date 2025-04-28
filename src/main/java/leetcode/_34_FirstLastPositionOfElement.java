package leetcode;

public class _34_FirstLastPositionOfElement {
    public int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;
        int i = binarySearch(nums, target);
        if (i != -1) {
            first = last = i;
            while (first - 1 >= 0 && nums[first - 1] == target) {
                first--;
            }
            while (last + 1 < nums.length && nums[last + 1] == target) {
                last++;
            }
        }
        return new int[] {first, last};
    }

    private int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
