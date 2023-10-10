package common.solutions.easy.string;

public class ReverseWords {
    // Task 557. Reverse Words in a String III https://leetcode.com/problems/reverse-words-in-a-string-iii/
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int indexSpace = s.indexOf(" ");
        int prevIndexSpace = -1;

        if (indexSpace <0)
            return revStr(s.toCharArray());
        while (indexSpace >= 0) {
            ans.append(revStr(s.substring(prevIndexSpace+1, indexSpace).toCharArray()));
            ans.append(" ");
            prevIndexSpace = indexSpace;
            indexSpace = s.indexOf(" ", prevIndexSpace+1);
        }
        ans.append(revStr(s.substring(prevIndexSpace+1).toCharArray()));

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