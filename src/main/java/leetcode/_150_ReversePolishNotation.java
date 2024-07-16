package leetcode;

import java.util.Stack;
import java.util.function.BiFunction;

public class _150_ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> stack.push(calc(stack, Integer::sum));
                case "-" -> stack.push(calc(stack, (a, b) -> a - b));
                case "*" -> stack.push(calc(stack, (a, b) -> a * b));
                case "/" -> stack.push(calc(stack, (a, b) -> a / b));
                default -> stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }

    private Integer calc(Stack<Integer> stack, BiFunction<Integer, Integer, Integer> biFunction) {
        var b = stack.pop();
        var a = stack.pop();
        return biFunction.apply(a, b);
    }
}
