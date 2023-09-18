package common.solutions.easy.string;

public class ReverseString {
    // Task 344. Reverse String https://leetcode.com/problems/reverse-string/
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
