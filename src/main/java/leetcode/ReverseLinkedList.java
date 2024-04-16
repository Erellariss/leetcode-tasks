package leetcode;

import leetcode.utils.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev, curr, next;
        prev = head;
        curr = head.next;
        next = head.next.next;

        prev.next = null;
        while (next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }
}
