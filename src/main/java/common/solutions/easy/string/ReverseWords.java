package common.solutions.easy.string;

import java.util.LinkedList;
import java.util.List;

public class ReverseWords {
    // Task 557. Reverse Words in a String III https://leetcode.com/problems/reverse-words-in-a-string-iii/
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            char[] str = word.toCharArray();
            ans.append(revStr(str));
            ans.append(' ');
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }

    public String revStr(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
        return new String(s);
    }
}