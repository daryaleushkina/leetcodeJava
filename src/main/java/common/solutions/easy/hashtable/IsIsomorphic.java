package common.solutions.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    // Task 205. Isomorphic Strings https://leetcode.com/problems/isomorphic-strings/
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        short n = (short) s.length();
        for (short i = 0; i < n; i++) {
            if (map.get(s.charAt(i)) == null) {
                if (map.containsValue(t.charAt(i)))
                    return false;
                else map.put(s.charAt(i), t.charAt(i));
            } else if (map.get(s.charAt(i)) != t.charAt(i))
                return false;
        }
        return true;

    }
}
