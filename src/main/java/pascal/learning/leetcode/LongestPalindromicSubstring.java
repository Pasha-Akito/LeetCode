package pascal.learning.leetcode;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int stringLength = s.length();
        for (int i = stringLength; i > 1; i--) {
            for (int j = 0; j <= stringLength - i; j++) {
                String tempS = s.substring(j, i + j);
                if (isStringPalindrome(tempS))
                    return tempS;
            }
        }
        return s.substring(0, 1);
    }

    private boolean isStringPalindrome(String s){
        int stringLength = s.length();
        int normaliseString = (stringLength % 2 == 0) ? 0 : 1;
        int halfStringLength = stringLength/2;
        String firstHalf = s.substring(0, halfStringLength);
        String secondHalf = s.substring(halfStringLength + normaliseString, stringLength);
        StringBuffer secondHalfReversed = new StringBuffer(secondHalf).reverse();
        return firstHalf.contentEquals(secondHalfReversed);
    }

}
