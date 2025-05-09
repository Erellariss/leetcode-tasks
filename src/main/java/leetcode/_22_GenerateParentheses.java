package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _22_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        return generateParenthesis(new ArrayList<String>(), "", 0, 0, n);
    }

    private List<String> generateParenthesis(List<String> strings, String currentString, int leftBrackets, int rightBrackets, int n) {
        if (leftBrackets < n) {
            generateParenthesis(strings, currentString + "(", leftBrackets + 1, rightBrackets, n);
        }
        if (rightBrackets < leftBrackets) {
            generateParenthesis(strings, currentString + ")", leftBrackets, rightBrackets + 1, n);
        }
        if (leftBrackets == n && leftBrackets == rightBrackets) {
            strings.add(currentString);
        }
        return strings;
    }
}
