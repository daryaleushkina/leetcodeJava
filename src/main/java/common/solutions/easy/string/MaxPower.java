package common.solutions.easy.string;

public class MaxPower {
    // Task 1446. Consecutive Characters https://leetcode.com/problems/consecutive-characters/
    public int maxPower(String s) {
        byte max = 0;
        byte cur = 1;

        if (s.length() == 1)
            return 1;

        for (short i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                cur++;
            else {
                max = (byte) Math.max(max, cur);
                cur = 1;
            }
        }

        return Math.max(max, cur);
    }
}
