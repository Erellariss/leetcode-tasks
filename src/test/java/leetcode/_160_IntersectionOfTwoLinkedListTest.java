package leetcode;

import leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class _160_IntersectionOfTwoLinkedListTest {

    private _160_IntersectionOfTwoLinkedList testee = new _160_IntersectionOfTwoLinkedList();

    @Test
    void name() {
        List<ListNode> a = ListNode.ofList(4, 1, 8, 4, 5);
        List<ListNode> b = ListNode.ofList(5, 6, 1);
        b.get(b.size() - 1).next = a.get(2);
        ListNode intersectionNode = testee.getIntersectionNode(a.get(0), b.get(0));
        assertNotNull(intersectionNode);
        assertEquals(8, intersectionNode.val);
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of()
        );
    }
}