package leetcode;

import leetcode.utils.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _142_LinkedListCycle2Test {

    private _142_LinkedListCycle2 testee = new _142_LinkedListCycle2();

    @ParameterizedTest
    @MethodSource("vals")
    void name(Integer expected, int[] list) {
        List<ListNode> listNodes = ListNode.ofList(list);
        if (expected != -1) {
            listNodes.get(list.length - 1).next = listNodes.get(expected);
            assertEquals(listNodes.get(expected).val, testee.detectCycle(listNodes.get(0)).val);
        } else {
            assertNull(testee.detectCycle(listNodes.get(0)));
        }

    }

    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(1, new int[]{3, 2, 0, -4}),
                Arguments.of(0, new int[]{1, 2}),
                Arguments.of(-1, new int[]{1})
        );
    }
}