package common.solutions.easy.hashtable;

public class FindTheDifference {
    // Task 389. Find the Difference https://leetcode.com/problems/find-the-difference/description/
    public char findTheDifference(String s, String t) {
        int[] map = new int[26];

        for (int i = 0; i < s.length(); i++)
            map[s.charAt(i) - 'a']++;


        for (int i = 0;i < t.length(); i++)
            if (map[t.charAt(i)-'a'] == 0)
                return t.charAt(i);
            else map[t.charAt(i)-'a']--;
        return ' ';
    }
}
