package leetcode;

public class _542_01_Matrix {

    public int[][] updateMatrix(int[][] mat) {
        // top-left fill
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != 0) {
                    int top = resolveDistance(mat, i - 1, j);
                    int left = resolveDistance(mat, i, j - 1);
                    mat[i][j] = Math.min(top, left);
                }
            }
        }
        // right-bottom fill
        for (int i = mat.length - 1; i >= 0; i--) {
            for (int j = mat[i].length - 1; j >= 0; j--) {
                int bottom = resolveDistance(mat, i + 1, j);
                int right = resolveDistance(mat, i, j + 1);
                mat[i][j] = Math.min(mat[i][j], Math.min(bottom, right));
            }
        }
        return mat;
    }

    private static Integer resolveDistance(int[][] mat, int i, int j) {
        if (i < 0 || j < 0 || i > mat.length - 1 || j > mat[0].length - 1) {
            return 999999;
        }
        return mat[i][j] + 1;
    }
}
