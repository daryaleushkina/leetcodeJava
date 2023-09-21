package common.solutions.easy.hashtable;

public class CanPermutePalindrome {
    // Task 266. Palindrome Permutation https://leetcode.com/problems/palindrome-permutation/
    public boolean canPermutePalindrome(String s) {
        short[] map = new short[26];
        for (int i = 0; i < s.length(); i++)
            map[s.charAt(i) - 'a']++;
        int countOdd = 0;
        for (short value : map)
            if (value % 2 == 1) {
                countOdd++;
                if (countOdd > 1)
                    return false;
            }
        return true;

    }
}
