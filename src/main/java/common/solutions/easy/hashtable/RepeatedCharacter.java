package common.solutions.easy.hashtable;

public class RepeatedCharacter {
    // Task 2351. First Letter to Appear Twice https://leetcode.com/problems/first-letter-to-appear-twice/description/
    public char repeatedCharacter(String s) {
        int[] ans = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ans[s.charAt(i)-'a']++;
            if (ans[s.charAt(i)-'a'] == 2)
                return s.charAt(i);
        }

        return ' ';
    }
}
