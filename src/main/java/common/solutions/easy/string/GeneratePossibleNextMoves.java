package common.solutions.easy.string;

import java.util.ArrayList;
import java.util.List;

public class GeneratePossibleNextMoves {
    // Task 293. Flip Game https://leetcode.com/problems/flip-game/
    public List<String> generatePossibleNextMoves(String currentState) {
        List<String> ans = new ArrayList();
        for (int i = 0; i < currentState.toCharArray().length - 1; i++) {
            if (currentState.charAt(i) == '+' && currentState.charAt(i + 1) == '+') {
                char[] temp = currentState.toCharArray();
                temp[i] = '-';
                temp[i + 1] = '-';
                ans.add(new String(temp));
            }
        }
        return ans;

    }
}
