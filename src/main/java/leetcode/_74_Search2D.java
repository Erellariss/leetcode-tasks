package leetcode;

public class _74_Search2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        return searchAs1d(matrix, target);
//        return searchAs2d(matrix, target);
    }

    private boolean searchAs1d(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int curr = matrix[mid / n][mid % n];
            if (curr == target) {
                return true;
            }
            if (target > curr) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    private static boolean searchAs2d(int[][] matrix, int target) {
        int rows = matrix.length - 1;
        int cols = matrix[0].length -1;

        int top = 0, bottom = rows;
        while (top < bottom) {
            int mid = top + (bottom - top) / 2;
            if (matrix[mid][0] == target) {
                return true;
            }
            if (matrix[mid][0] > target) {
                bottom = mid - 1;
            } else {
                top = mid + 1;
            }
        }
        int left = 0, right = cols;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[top][mid] == target) {
                return true;
            }
            if (matrix[top][mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
