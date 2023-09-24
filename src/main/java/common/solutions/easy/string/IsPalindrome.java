package common.solutions.easy.string;

public class IsPalindrome {
    // Task 125. Valid Palindrome https://leetcode.com/problems/valid-palindrome/
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (leftChar != rightChar) {
                String s1 = s.substring(0, left) + s.substring(left + 1, s.length());
                String s2 = s.substring(0, right) + s.substring(right + 1, s.length());

                return isPalindrome(s1) || isPalindrome(s2);
            } else {
                left++;
                right--;
            }
        }

        return true;
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
