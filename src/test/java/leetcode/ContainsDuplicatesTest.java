package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {

    @Test
    public void containsDuplicates() {
        assertTrue(_217_ContainsDuplicates.containsDuplicate(new int[] {1,2,3,1}));
        assertFalse(_217_ContainsDuplicates.containsDuplicate(new int[] {1,2,3}));
    }

}