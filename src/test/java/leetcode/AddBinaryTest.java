package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    AddBinary solution = new AddBinary();

    @Test
    void case1() {
        testCase("11", "1", "100");
    }

    @Test
    void case2() {
        testCase("1010", "1011", "10101");
    }

    private void testCase(String a, String b, String result) {
        assertEquals(result, solution.addBinary(a, b));
    }
}