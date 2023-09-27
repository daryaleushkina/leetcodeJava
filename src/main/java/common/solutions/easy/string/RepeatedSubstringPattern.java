package common.solutions.easy.string;

public class RepeatedSubstringPattern {
    // Task 459. Repeated Substring Pattern https://leetcode.com/problems/repeated-substring-pattern/
    public boolean repeatedSubstringPattern(String s) {
        String copy = s;
        String ans = copy.substring(1, copy.length()-1);
        return ans.contains(s);
    }

}
