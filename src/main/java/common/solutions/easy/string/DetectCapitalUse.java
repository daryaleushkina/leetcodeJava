package common.solutions.easy.string;

public class DetectCapitalUse {
    // Task 520. Detect Capital https://leetcode.com/problems/detect-capital/
    public boolean detectCapitalUse(String word) {
        short count = 0;
        for (Character c : word.toCharArray())
            if (Character.isUpperCase(c))
                count++;
        if (count == word.length() || count == 0 || (count == 1 && Character.isUpperCase(word.charAt(0))))
            return true;
        else return false;
    }
}
