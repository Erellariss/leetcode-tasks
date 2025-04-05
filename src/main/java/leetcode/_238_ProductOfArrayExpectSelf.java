package leetcode;

import java.util.Arrays;

public class _238_ProductOfArrayExpectSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        return productExceptSelf_O1(nums, n);
    }

    private static int[] productExceptSelf_On(int[] nums, int n) {
        int[] answer = new int[n];
        int[] pre = new int[n];
        int[] suff = new int[n];
        pre[0] = suff[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            answer[i] = pre[i] * suff[i];
        }

        return answer;
    }

    private static int[] productExceptSelf_O1(int[] nums, int n) {
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}
