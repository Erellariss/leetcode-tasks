package leetcode;

public class _283_MoveZeroes {

    public void moveZeroes(int[] nums) {
        int zeroStartIndex = nums.length;
        int writeIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroStartIndex--;
                if (writeIndex == -1) {
                    writeIndex = i;
                }
            } else if (writeIndex != -1 ){
                nums[writeIndex++] = nums[i];
            }
        }
        for (int i = zeroStartIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
