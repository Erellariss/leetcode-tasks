package leetcode;

public class _33_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int left = 0;
        int right = nums.length - 1;
        if (nums[pivot] <= target && target <= nums[right]) {
            left = pivot;
        } else {
            right = pivot - 1;
        }
        return binarySearch(nums, target, left, right);
    }

    private int findPivot(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // If mid element is greater than the rightmost element, pivot is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid; // not -1, because mid could be pivot
            }
        }
        return left;
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
