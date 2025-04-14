package leetcode;

public class _48_RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int r = 0; r < n; r++) {
            for (int c = r; c < n; c++) {
                swap(matrix, r, c, c, r);
            }
        }
        for (int r = 0; r < n; r++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                swap(matrix, r, start++, r, end--);
            }
        }
    }

    private static void swap(int[][] matrix, int r1, int c1, int r2, int c2) {
        int temp = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = temp;
    }
}
