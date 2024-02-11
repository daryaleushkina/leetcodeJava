package common.solutions.medium.bynarysearch;

import java.util.Arrays;

public class SuccessfulPairs {
    // Task 2300. Successful Pairs of Spells and Potions https://leetcode.com/problems/successful-pairs-of-spells-and-potions/
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            int left = 0;
            int right = potions.length - 1;
            int tempAns = 0;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) spells[i] * potions[mid] >= success) {
                    tempAns = potions.length - mid;
                    right = mid - 1;
                } else
                    left = mid + 1;
            }
            spells[i] = tempAns;

        }
        return spells;
    }
}
