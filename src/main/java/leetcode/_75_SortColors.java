package leetcode;

public class _75_SortColors {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for (int num : nums) {
            colors[num]++;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            while (colors[j] == 0) {
                j++;
            }
            colors[j]--;
            nums[i] = j;
        }
    }
}
