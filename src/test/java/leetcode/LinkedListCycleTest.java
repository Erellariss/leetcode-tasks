package leetcode;

import leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListCycleTest {

    private final LinkedListCycle solution = new LinkedListCycle();

    @Test
    void hasCycle1() {
        assertTrue(solution.hasCycle(prepareData(ListNode.ofList(3, 2, 0, -4), 1)));
    }

    @Test
    void hasCycle2() {
        assertTrue(solution.hasCycle(prepareData(ListNode.ofList(1,2), 0)));
    }

    @Test
    void hasCycle3() {
        assertFalse(solution.hasCycle(prepareData(ListNode.ofList(1), -1)));
    }

    private static ListNode prepareData(List<ListNode> nodesList, int indexToCycle) {
        if (nodesList.isEmpty()) {
            return null;
        }
        ListNode head = nodesList.get(0);
        ListNode tail = nodesList.get(nodesList.size() -1);
        if (indexToCycle != -1) {
            tail.next = nodesList.get(indexToCycle);
        }
        return head;
    }
}