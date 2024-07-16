package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _150_ReversePolishNotationTest {
    private _150_ReversePolishNotation testee = new _150_ReversePolishNotation();

    @Test
    void case1() {
        assertEquals(9, testee.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    void case2() {
        assertEquals(6, testee.evalRPN(new String[]{"4","13","5","/","+"}));
    }
    @Test
    void case3() {
        assertEquals(22, testee.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}