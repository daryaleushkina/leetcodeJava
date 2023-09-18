package common.solutions.easy.hashtable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqChar {

    // Task 387. First Unique Character in a String https://leetcode.com/problems/first-unique-character-in-a-string/
    public int firstUniqChar(String s) {

        int ans[] = new int[26];
        for (int i = 0; i < s.length(); i++)
            ans[s.charAt(i) - 'a']++;
        for (int i = 0; i < 26; i++)
            if (ans[i] == 1)
                return s.indexOf(ans[i]);

        return -1;
//        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
//
//        for (char ch : s.toCharArray())
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//
//        for (Character key : map.keySet())
//            if (map.get(key) == 1)
//                return s.indexOf(key);
//
//        return -1;


//        for (int i = 0 ; i < s.length(); i++){
//            if (s.indexOf(s.charAt(i)) == i && s.indexOf(s.charAt(i), i + 1) <0)
//                return i;
//        }
//        return -1;
    }

}
