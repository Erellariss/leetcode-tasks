package leetcode;

public class SubStringSwap {

    public static char[] swapSubstring(char[] src, int indexExcl) {
        if (src == null
                || indexExcl <= 0
                || indexExcl > src.length - 1) {
            return src;
        }
        reverseSubString(src, 0, src.length);
        reverseSubString(src, 0, indexExcl);
        reverseSubString(src, indexExcl, src.length);
        return src;
    }

    private static void reverseSubString(char[] src, int start, int endExcl) {
        while (start < endExcl) {
            swapChar(src, --endExcl, start++);
        }
    }

    private static void swapChar(char[] src, int a, int b) {
        char temp;
        temp = src[a];
        src[a] = src[b];
        src[b] = temp;
    }
}
