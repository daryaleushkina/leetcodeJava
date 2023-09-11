package common.solutions.easy.string;

public class LengthOfLastWord {
    // Task 58. Length of Last Word https://leetcode.com/problems/length-of-last-word
    public int lengthOfLastWord(String s) {
        int curCount = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                curCount++;
            else if (curCount != 0)
                return curCount;
        }
        return curCount;

    }
}
