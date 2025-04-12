package leetcode;

public class _76_MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int sn = s.length(), tn = t.length();
        if (tn > sn) {
            return "";
        }
        int[] targetWindow = new int[128];
        int[] window = new int[128];
        for (int i = 0; i < tn; i++) {
            targetWindow[t.charAt(i)]++;
            window[s.charAt(i)]++;
        }
        if (containsAll(window, targetWindow)) {
            return s.substring(0, tn);
        }
        int min = sn + 1;
        int start = 0, end = tn;
        int minStartIndex = 0;
        //slide window through s
        while (end < sn) {
            if (containsAll(window, targetWindow)) {
                if (end - start < min) {
                    min = end - start;
                    minStartIndex = start;
                }
                window[s.charAt(start++)]--;
            } else {
                window[s.charAt(end++)]++;
            }
        }
        // tighten left while possible
        while (containsAll(window, targetWindow)) {
            if (end - start < min) {
                min = end - start;
                minStartIndex = start;
            }
            window[s.charAt(start++)]--;
        }
        if (min > sn) return "";

        return s.substring(minStartIndex, minStartIndex + min);
    }

    private boolean containsAll(int[] window, int[] targetWindow) {
        for (int i = 0; i < targetWindow.length; i++) {
            if (window[i] < targetWindow[i]) {
                return false;
            }
        }
        return true;
    }
}
