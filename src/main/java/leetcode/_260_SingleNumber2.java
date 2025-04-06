package leetcode;

public class _260_SingleNumber2 {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int xor2no = 0;
        for (int num : nums) {
            xor2no ^= num;
        }
        int lowestBit = xor2no & (-xor2no);
        for (int num : nums) {
            if ((lowestBit & num) == 0) {
                ans[0] ^= num;
            } else {
                ans[1] ^=num;
            }
        }
        return ans;
    }
}
