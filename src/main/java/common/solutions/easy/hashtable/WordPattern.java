package common.solutions.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    // Task 290. Word Pattern https://leetcode.com/problems/word-pattern/description/
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");

        if (pattern.length() != words.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (!map.containsKey(ch))
                if (map.containsValue(word))
                    return false;
                else map.put(ch, word);

            else if (!map.get(ch).equals(word))
                return false;

        }

        return true;
    }

}
