package leetcode;

public class _733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int srcColor = image[sr][sc];
        if (srcColor == color) {
            return image;
        }
        return floodFill(image, sr, sc, srcColor, color);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int srcColor, int color) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[sr].length) {
            return image;
        }
        if (image[sr][sc] != srcColor) {
            return image;
        }
        image[sr][sc] = color;
        floodFill(image, sr - 1, sc, srcColor, color);
        floodFill(image, sr + 1, sc, srcColor, color);
        floodFill(image, sr, sc - 1, srcColor, color);
        return floodFill(image, sr, sc + 1, srcColor, color);
    }
}
