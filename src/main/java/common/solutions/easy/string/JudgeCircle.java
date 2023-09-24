package common.solutions.easy.string;

import java.util.HashMap;
import java.util.Map;

public class JudgeCircle {
    // Task 657. Robot Return to Origin https://leetcode.com/problems/robot-return-to-origin/
    public boolean judgeCircle(String moves) {
        short vertical = 0;
        short horizontal = 0;

        for (char c : moves.toCharArray())
            if (c == 'U')
                vertical++;
            else if (c == 'D')
                vertical--;
            else if (c == 'R')
                horizontal++;
            else horizontal--;
        return horizontal == 0 && vertical == 0;

//            map.put(c, map.getOrDefault(c, 0) + 1);
//        Map<Character, Integer> map = new HashMap<>();
//        for (Character c : moves.toCharArray())
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        for (Character c : "UDLR".toCharArray())
//            if (map.get(c) == null)
//                map.put(c, -1);
//
//        if (map.get('L').compareTo(map.get('R')) == 0 && map.get('U').compareTo(map.get('D')) == 0)
//            return true;
//        else return false;

    }
}
