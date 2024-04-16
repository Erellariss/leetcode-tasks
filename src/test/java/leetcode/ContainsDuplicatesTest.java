package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {

    @Test
    public void containsDuplicates() {
        assertTrue(ContainsDuplicates.containsDuplicate(new int[] {1,2,3,1}));
        assertFalse(ContainsDuplicates.containsDuplicate(new int[] {1,2,3}));
    }

}