package common.solutions.easy.string;

public class ReverseWords151 {
    // Task 151. Reverse Words in a String https://leetcode.com/problems/reverse-words-in-a-string
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder ans = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
            ans.append(words[i]).append(" ");

        return ans.toString().trim();

    }
}
