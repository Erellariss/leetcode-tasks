package leetcode;

import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.toLowerCase;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }
            if (!isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }
            if(toLowerCase(s.charAt(start)) != toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
