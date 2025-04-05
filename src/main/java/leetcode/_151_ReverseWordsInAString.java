package leetcode;

public class _151_ReverseWordsInAString {
    public String reverseWords(String s) {
//        return reverseWordsEasyWay(s);
        return reverseWordsHardWay(s);
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
        while (s.charAt(start) == ' ') {
            start++;
        }
        int end = s.length() - 1;
        while (s.charAt(end) == ' ') {
            end--;
        }
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
