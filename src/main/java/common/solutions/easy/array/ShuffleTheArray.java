package common.solutions.easy.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ShuffleTheArray {
//    Task 1470 https://leetcode.com/problems/shuffle-the-array/description/
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for (int i = 0; i < 2 * n; i++)
            if (i < n)
                x.add(nums[i]);
            else y.add(nums[i]);
        int[] ans = new int[2 * n];
        for (int i = 0; i < 2 * n; i++)
            if (i % 2 == 0)
                ans[i] = x.get(i / 2);
            else ans[i] = y.get(i / 2);

        return ans;

    }
}
