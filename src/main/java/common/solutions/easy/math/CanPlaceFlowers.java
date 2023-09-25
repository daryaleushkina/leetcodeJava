package common.solutions.easy.math;

import java.util.Arrays;

public class CanPlaceFlowers {
    // Task 605. Can Place Flowers https://leetcode.com/problems/can-place-flowers/
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int tempCount = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0)
                tempCount++;
            if (flowerbed[i] != 0 || i == flowerbed.length - 1)
                if (tempCount > 0) {
                    if (i == 0 || i == flowerbed.length - 1) {
                        if (tempCount / 3 > 0)
                            count += ((tempCount / 3) + 1);
                        else count++;
                    } else {
                        count += (tempCount / 3);
                        if (tempCount % 3 > 0)
                            count++;
                    }
                    tempCount = 0;
                }
        }


        count += tempCount / 3 + 1;

        return count >= n;

    }
}