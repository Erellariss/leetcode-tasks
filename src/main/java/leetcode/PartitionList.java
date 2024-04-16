package leetcode;

import leetcode.utils.ListNode;

public class PartitionList {
    public static ListNode partition(ListNode head, int x) {
        ListNode leftPartition = null;
        ListNode leftPartitionHead = null;
        ListNode rightPartition = null;
        ListNode rightPartitionHead = null;
        ListNode current;

        while (head != null) {
            current = head;
            head = head.next;
            if (current.val >= x) {
                if (rightPartitionHead == null) {
                    rightPartitionHead = rightPartition = current;
                } else {
                    rightPartition.next = current;
                    rightPartition = current;
                }
            } else {
                if (leftPartitionHead == null) {
                    leftPartitionHead = leftPartition = current;
                } else {
                    leftPartition.next = current;
                    leftPartition = current;
                }
            }
        }
        if (leftPartition != null) {
            leftPartition.next = rightPartitionHead;
        }
        if (rightPartition != null) {
            rightPartition.next = null;
        }

        return leftPartitionHead != null ? leftPartitionHead : rightPartitionHead;
    }
}
