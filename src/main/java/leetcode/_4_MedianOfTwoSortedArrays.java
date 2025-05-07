package leetcode;

public class _4_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int x = nums1.length;
        int y = nums2.length;
        int low = 0, high = x;
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int leftMaxX = partitionX > 0 ? nums1[partitionX - 1] : Integer.MIN_VALUE;
            int rightMinX = partitionX < x ? nums1[partitionX] : Integer.MAX_VALUE;
            int leftMaxY = partitionY > 0 ? nums2[partitionY - 1] : Integer.MIN_VALUE;
            int rightMinY = partitionY < y? nums2[partitionY] : Integer.MAX_VALUE;

            if (leftMaxX <=rightMinY
                && leftMaxY <= rightMinX) {
                if ((x + y) % 2 == 0) {
                    return (double) (Math.max(leftMaxX, leftMaxY) + Math.min(rightMinX, rightMinY)) / 2;
                } else {
                    return Math.max(leftMaxX, leftMaxY);
                }
            } else if (leftMaxX > rightMinY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }
        return 0.0;
    }
}
