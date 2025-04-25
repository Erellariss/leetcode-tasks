package leetcode;

import leetcode.utils.ListNode;
import leetcode.utils.TreeNode;

public class _109_ConvertSortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        return sortedListToBST(head, null);
    }

    private TreeNode sortedListToBST(ListNode head, ListNode tail) {
        if (head == tail) {
            return null;
        }
        ListNode fast = head, slow = head;
        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.val);
        return new TreeNode(slow.val, sortedListToBST(head, slow), sortedListToBST(slow.next, tail));
    }
}
