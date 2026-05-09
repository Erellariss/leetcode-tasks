package leetcode;

public class _151_ReverseWordsInAString {
    public String reverseWords(String s) {
//        return reverseWordsEasyWay(s);
//        return reverseWordsHardWay(s);
        return reverseWordsInPlace(s);
    }

    private String reverseWordsInPlace(String s) {
        char[] c = s.toCharArray();
        reverse(c, 0, c.length - 1);
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ') {
                int wordEnd = wordEnd(c, i);
                reverse(c, i, wordEnd);
                i = wordEnd + 1;
            }
        }

        return cleanSpaces(c);
    }

    private String cleanSpaces(char[] c) {
        int n = c.length, i = 0, j = 0;

        while (j < n) {
            while (j < n && c[j] == ' ') j++;
            while (j < n && c[j] != ' ') c[i++] = c[j++];
            while (j < n && c[j] == ' ') j++;
            if (j < n) c[i++] = ' ';
        }

        return new String(c, 0, i);
    }


    private void reverse(char[] c, int start, int end) {
        while (start < end) {
            swap(c, start++, end--);
        }
    }

    private int wordEnd(char[] c, int i) {
        for (; i < c.length; i++) {
            if (c[i] == ' ') {
                return i - 1;
            }
        }
        return c.length - 1;
    }

    private static void swap(char[] c, int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }


    private String reverseWordsEasyWay(String s) {
        String[] arr = s.trim().split("\\s+");
        int a = 0, b = arr.length - 1;
        while (a < b) {
            String t = arr[a];
            arr[a] = arr[b];
            arr[b] = t;
            a++;
            b--;
        }
        return String.join(" ", arr);
    }

    private String reverseWordsHardWay(String s) {
        StringBuilder sb = new StringBuilder();
        int start = 0;

        //region trim
        while (s.charAt(start) == ' ') {
            start++;
        }
        int end = s.length() - 1;
        while (s.charAt(end) == ' ') {
            end--;
        }
        //endregion
        char prevChar = s.charAt(end--);
        sb.append(prevChar);
        for (int i = end; i >= start; i--) {
            if (prevChar == ' ' && s.charAt(i) == ' ') {
                continue;
            }
            sb.append(s.charAt(i));
            prevChar = s.charAt(i);
        }
        for (int i = 0; i < sb.length(); i++) {
            i = reverseWordAt(i, sb);
        }
        return sb.toString();
    }

    private int reverseWordAt(int wordStart, StringBuilder sb) {
        for (int j = wordStart; j < sb.length(); j++) {
            if (sb.charAt(j) == ' ') {
                reverse(sb, wordStart, j - 1);
                return j;
            }
        }
        reverse(sb, wordStart, sb.length() - 1);
        return sb.length();
    }

    private void reverse(StringBuilder arr, int from, int to) {
        while (from < to) {
            char temp = arr.charAt(from);
            arr.setCharAt(from, arr.charAt(to));
            arr.setCharAt(to, temp);
            from++;
            to--;
        }
    }
}
