package common.solutions.easy.math;

public class MinMoves {
    // Task 2139. Minimum Moves to Reach Target Score https://leetcode.com/problems/minimum-moves-to-reach-target-score/
    public int minMoves(int target, int maxDoubles) {
        short count = 0;
        while (target - 1 >= 1) {
            if (maxDoubles == 0)
                return count + target - 1;
            if (target % 2 != 0)
                target--;
            else {
                target /= 2;
                maxDoubles--;
            }
            count++;
        }

        return count;

    }
}
