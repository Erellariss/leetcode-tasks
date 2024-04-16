package leetcode;

import leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionListTest {

    @Test
    public void partitionCase1() {
        ListNode actual = PartitionList.partition(ListNode.of(1, 4, 3, 2, 5, 2), 3);
        assertArrayEquals(new int[] {1, 2, 2, 4, 3, 5}, actual.toArray());
    }

    @Test
    public void partitionCase2() {
        ListNode actual = PartitionList.partition(ListNode.of(2, 1), 2);
        assertArrayEquals(new int[] {1, 2}, actual.toArray());
    }

    @Test
    public void partitionCase3() {
        ListNode actual = PartitionList.partition(ListNode.of(1), 0);
        assertArrayEquals(new int[] {1}, actual.toArray());
    }
}