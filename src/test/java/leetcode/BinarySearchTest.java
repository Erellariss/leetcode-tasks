package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch testee = new BinarySearch();

    @Test
    void search() {
        assertEquals(4, testee.search(new int[] {-1,0,3,5,9,12}, 9));
    }
    @Test
    void search2() {
        assertEquals(-1, testee.search(new int[] {-1,0,3,5,9,12}, 2));
    }
}