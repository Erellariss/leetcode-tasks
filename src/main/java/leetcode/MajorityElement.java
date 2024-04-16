package leetcode;

public class MajorityElement {

    // Boyer-Moore Majority Voting Algorithm
    public int majorityElement(int[] nums) {
        int count = 0, candidate = -1;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
            if (count > nums.length / 2) {
                return candidate;
            }
        }
        return -1;
    }

}
