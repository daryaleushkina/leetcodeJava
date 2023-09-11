package common.solutions.easy.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsAnagram {
    // Task 242. Valid Anagram https://leetcode.com/problems/valid-anagram/description/

    public boolean isAnagram(String s, String t) {

        //Fast solution

        if (s.length() != t.length())
            return false;

        int[] count = new int[26];

        for (char c : s.toCharArray())
            count[c - 'a']++;

        for (char c : t.toCharArray())
            count[c - 'a']--;

        for (int i : count)
            if (i != 0)
                return false;


        return true;

//        if (s.length() != t.length())
//            return false;
//
//        int i = 0;
//        while(i<s.length()) {
//
//            if (t.indexOf(s.charAt(i)) < 0)
//                return false;
//            else {
//                t = t.replaceFirst(String.valueOf(s.charAt(i)), "");
//                s = s.replaceFirst(String.valueOf(s.charAt(i)), "");
//            }
//        }
//        return true;

        // first solution
//        if (s.length() != t.length())
//            return false;
//
//        Map<Character, Integer> map1 = new HashMap<>();
//        Map<Character, Integer> map2 = new HashMap<>();
//        String alp = "abcdefghijklmnopqrstuvwxyz";
//        for (int i = 0; i < alp.length(); i++) {
//            map1.put(alp.charAt(i), 0);
//            map2.put(alp.charAt(i), 0);
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
//            map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
//        }
//
//
//        return map1.equals(map2);

    }
}
