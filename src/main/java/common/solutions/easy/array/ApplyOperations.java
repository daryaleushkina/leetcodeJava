package common.solutions.easy.array;

import java.util.Arrays;

public class ApplyOperations {
    //    Task 2460. Remove Element https://leetcode.com/problems/apply-operations-to-an-array/

    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        int count = nums.length;
        int i = 0;
        while (i < count) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++)
                    nums[j] = nums[j + 1];
                nums[nums.length-1] = 0;
                count--;
            } else {
                i++;
            }
        }
       return nums;
    }
}
