package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    MaximumSubarray solution = new MaximumSubarray();

    @Test
    void maxSubArray() {
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void maxSubArray1() {
        assertEquals(1, solution.maxSubArray(new int[]{1}));
    }

    @Test
    void maxSubArray2() {
        assertEquals(23, solution.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}