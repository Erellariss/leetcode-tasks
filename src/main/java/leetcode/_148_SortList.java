package leetcode;

import leetcode.utils.ListNode;

public class _148_SortList {
    public ListNode sortList(ListNode head) {
//        return topDown(head);
        return bottomUp(head);
    }

    private ListNode bottomUp(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        for (int step = 1; step < length; step *= 2) {
            ListNode tail = dummy;
            ListNode curr = dummy.next;
            while (curr != null) {
                ListNode left = curr;
                ListNode right = split(left, step);
                curr = split(right, step);
                tail = merge(left, right, tail);
            }
        }
        return dummy.next;
    }

    private ListNode split(ListNode head, int size) {
        for (int i = 1; i < size && head != null; i++) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode right = head.next;
        head.next = null;
        return right;
    }

    /**
     * @param l1 left
     * @param l2 right
     * @param tail old tail to attach to.
     * @return new tail after merge.
     */
    private ListNode merge(ListNode l1, ListNode l2, ListNode tail) {
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = l1 != null ? l1 : l2;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    private ListNode topDown(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head, slow = head, left = null;
        while (fast != null && fast.next != null) {
            left = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        left.next = null;
        var leftHalf = topDown(head);
        var rightHalf = topDown(slow);
        return merge(leftHalf, rightHalf);
    }

    private ListNode merge(ListNode leftHalf, ListNode rightHalf) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        while (leftHalf != null && rightHalf != null) {
            if (leftHalf.val < rightHalf.val) {
                current.next = leftHalf;
                leftHalf = leftHalf.next;
            } else {
                current.next = rightHalf;
                rightHalf = rightHalf.next;
            }
            current = current.next;
        }
        current.next = leftHalf != null ? leftHalf : rightHalf;
        return head.next;
    }
}
