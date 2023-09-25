package common.solutions.easy.math;

import java.util.Arrays;

public class CanPlaceFlowers {
    // Task 605. Can Place Flowers https://leetcode.com/problems/can-place-flowers/
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean canPlace = true;

                if (i > 0 && flowerbed[i - 1] == 1)
                    canPlace = false;
                if (i < flowerbed.length - 1 && flowerbed[i + 1] == 1)
                    canPlace = false;

                if (canPlace) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count >= n;

    }
}