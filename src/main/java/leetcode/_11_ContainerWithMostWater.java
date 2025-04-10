package leetcode;

public class _11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, n = height.length, right = n - 1;
        int maxResult = 0;
        while (left < right) {
            int current = Math.min(height[left], height[right]) * (right - left);
            if (current > maxResult) {
                maxResult = current;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxResult;
    }
}
