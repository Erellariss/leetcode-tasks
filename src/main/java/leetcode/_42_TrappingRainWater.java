package leetcode;

public class _42_TrappingRainWater {
    public int trap(int[] h) {
        int l = 0, r = h.length - 1, lmax = 0, rmax = 0, sum = 0;
        while (l < r) {
            lmax = Math.max(lmax, h[l]);
            rmax = Math.max(rmax, h[r]);
            if (lmax < rmax) {
                sum += lmax - h[l++];
            } else {
                sum += rmax - h[r--];
            }
        }
        return sum;
    }
}
