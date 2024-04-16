package leetcode;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] letters = new int['z' - 'A' + 1];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'A']++;
        }

        int answer = 0;
        int oddCount = 0;
        int countainsOdd = 0;
        for (int letter : letters) {
            if (letter % 2 != 0) {
                oddCount++;
                countainsOdd = 1;
            }
            answer += letter;
        }

        return answer - oddCount + countainsOdd;
    }
}
