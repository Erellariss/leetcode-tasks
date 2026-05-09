package leetcode;

public class _169_MajorityElement {

    // Boyer-Moore Majority Voting Algorithm
    public int majorityElement(int[] nums) {
        return boyerMooreV2(nums);
    }

    private int boyerMooreV2(int[] nums) {
        int candidate = nums[0], count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate)? 1 : -1;
        }

        return candidate;
    }

}
