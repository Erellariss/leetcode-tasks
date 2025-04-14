package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        return optimizedDirectionChange(matrix);
//        return basicSimulation(matrix);
    }

    private List<Integer> optimizedDirectionChange(int[][] matrix) {
        int row = 0, col = 0, direction = 0;
        int visited = Integer.MIN_VALUE;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rowDirection = new int[]{0, 1, 0, -1};
        int[] colDirection = new int[]{1, 0, -1, 0};

        var answer = new ArrayList<Integer>();
        for (int i = 0; i < m * n; i++) {
            answer.add(matrix[row][col]);
            matrix[row][col] = visited;

            int nextRow = row + rowDirection[direction];
            int nextCol = col + colDirection[direction];

            if (nextRow >= 0 && nextRow < m && nextCol >= 0 && nextCol < n && matrix[nextRow][nextCol] != visited) {
                row = nextRow;
                col = nextCol;
            } else {
                direction = (direction + 1) % 4;
                row += rowDirection[direction];
                col += colDirection[direction];
            }
        }

        return answer;
    }

    private List<Integer> basicSimulation(int[][] matrix) {
        int left = 0, top = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        List<Integer> answer = new ArrayList<>();
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) { // right
                answer.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) { // down
                answer.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) { // left
                    answer.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) { // up
                    answer.add(matrix[i][left]);
                }
                left++;
            }
        }
        return answer;
    }
}
