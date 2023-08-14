package common.solutions.easy.array;

import java.util.Arrays;

public class MoveZeroes {
    //    Task №283. Remove Element https://leetcode.com/problems/move-zeroes/description/

    public void moveZeroes(int[] nums) {
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
        String output = Arrays.toString(nums).replace(" ", "");
        System.out.println(output);
    }

}
