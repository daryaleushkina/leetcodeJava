package common.solutions.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    // Task 409. Longest Palindrome https://leetcode.com/problems/longest-palindrome/
    public int longestPalindrome(String s) {
        int[] map = new int[52];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90)
                map[ch - 'A']++;
            else
                map[26 + ch - 'a']++;
        }


        int ans = 0;
        boolean hasOddValue = false;
        for (int value : map) {
            if (value % 2 == 0)
                ans += value;
            else {
                ans += (value - 1);
                hasOddValue = true;
            }
        }
        if (hasOddValue)
            ans += 1;

        return ans;
    }
}
