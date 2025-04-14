package leetcode;

import leetcode.utils.ListNode;

public class _25_ReverseNodesInGroup {
    @SuppressWarnings("UnnecessaryLocalVariable")
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        ListNode tail = getTail(head, k);
        if (tail == null) {
            return head;
        } else {
            ListNode newGroupHead = reverseKGroup(tail.next, k);
            reverse(head, tail).next = newGroupHead;
            return tail;
        }
    }

    // return new tail (old head)
    private ListNode reverse(ListNode head, ListNode tail) {
        if (head == tail) {
            return tail;
        }
        return reverse(head.next, tail).next = head;
    }

    private ListNode getTail(ListNode head, int k) {
        ListNode tail = head;
        for (int i = 0; i < k - 1; i++) {
            if (tail == null) {
                return null;
            }
            tail = tail.next;
        }
        return tail;
    }
}
