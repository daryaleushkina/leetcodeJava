package common.solutions.easy.array;

import java.util.Arrays;

public class HeightChecker {
    // Task 1051. Height Checker https://leetcode.com/problems/height-checker/
    public int heightChecker(int[] heights) {
        short count = 0;
        boolean canSwap = true;
        int[] temp = Arrays.copyOf(heights, heights.length);

        while (canSwap) {
            canSwap = false;
            for (short i = 0; i < heights.length - 1; i++) {
                if (heights[i] > heights[i + 1]) {
                    int t = heights[i];
                    heights[i] = heights[i + 1];
                    heights[i + 1] = t;
                    canSwap = true;
                }
            }

        }

        for (short i = 0; i < heights.length; i++)
            if (heights[i] != temp[i])
                count++;

        return count;

    }
}
