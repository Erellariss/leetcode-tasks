package leetcode;

import leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ReverseLinkedListTest {

    ReverseLinkedList solution = new ReverseLinkedList();

    @Test
    void reverseList() {
        testCase(1, 2, 3, 4, 5);
    }

    @Test
    void name2() {
        testCase();
    }

    @Test
    void name() {
        testCase(1,2);
    }

    private void testCase(int... ints) {
        ListNode head = solution.reverseList(ListNode.of(ints));
        for (int i = ints.length - 1; i >= 0; i--) {
            Assertions.assertEquals(ints[i], head.val);
            head = head.next;
        }
    }
}