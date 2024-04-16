package leetcode.utils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(int... vals) {
        ListNode head = null;
        for (int i = vals.length - 1; i >= 0 ; i--) {
            head = new ListNode(vals[i], head);
        }
        return head;
    }

    public static List<ListNode> ofList(int... vals) {
        if (vals.length == 0) {
            return List.of();
        }

        List<ListNode> list = Arrays.stream(vals)
                .boxed()
                .map(ListNode::new)
                .collect(Collectors.toList());

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }
        return list;
    }

    public int[] toArray() {
        LinkedList<Integer> result = new LinkedList<>();
        ListNode head = this;
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}