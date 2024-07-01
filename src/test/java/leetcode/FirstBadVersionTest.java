package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstBadVersionTest {

    @Test
    void fbv1() {
        verifyCase(5, 4);
    }

    @Test
    void firstBadVersion() {
        verifyCase(1, 1);
    }
    @Test
    void firstBadVersion2() {
        verifyCase(2, 2);
    }

    @Test
    void fbv3() {
        verifyCase(2126753390, 1702766719);
    }

    private static void verifyCase(int n, int bad) {
        Assertions.assertEquals(bad, new _278_FirstBadVersion(bad).firstBadVersion(n));
    }
}