package pascal.learning.leetcode;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int stringLength = s.length();
        int start = 0;
        int end = 0;

        for (int i = 0; i < stringLength; i++) {
            for (int j = 0; j <= 1; j++) {
                int left = i;
                int right = i + j;
                while (left >= 0 && right <= stringLength - 1 && s.charAt(left) == s.charAt(right)) {
                    left--;
                    right++;
                }
                left++;
                right--;
                if (right - left > end - start) {
                    start = left;
                    end = right;
                }
            }
        }
        return s.substring(start, end + 1);
    }
}
