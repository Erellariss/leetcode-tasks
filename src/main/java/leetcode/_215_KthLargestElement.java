package leetcode;

import java.util.Random;

public class _215_KthLargestElement {
    private final Random rand = new Random();

    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length -1, nums.length - k);
    }

    private int quickSelect(int[] nums, int left, int right, int kSmallest) {
        if (left == right) {
            return nums[left];
        }
        int nextPivot = left + rand.nextInt(right - left + 1);
        int pivotIndex = partition(nums, left, right, nextPivot);
        if (pivotIndex == kSmallest) {
            return nums[kSmallest];
        } else if (kSmallest < pivotIndex) {
            return quickSelect(nums, left, pivotIndex - 1, kSmallest);
        } else {
            return quickSelect(nums, pivotIndex + 1, right, kSmallest);
        }
    }

    private int partition(int[] nums, int left, int right, int pivot) {
        int pivotValue = nums[pivot];
        swap(nums, pivot, right);
        int storeIndex = left;

        for (int i = left; i < right ; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, storeIndex++, i);
            }
        }
        swap(nums, right, storeIndex);
        return storeIndex;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
