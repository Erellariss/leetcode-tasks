package leetcode;

public class _338_CountingBits {
    public int[] countBits(int n) {
        int[] ints = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            ints[i] = ints[i >> 1] + (i & 1);
        }
        return ints;
    }
}
