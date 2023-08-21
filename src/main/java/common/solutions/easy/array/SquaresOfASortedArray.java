package common.solutions.easy.array;

import java.util.Arrays;

public class SquaresOfASortedArray {
    // Task 977. Squares of a Sorted Array https://leetcode.com/problems/squares-of-a-sorted-array/

    public int[] sortedSquares(int[] nums) {
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i] * nums[i];
        }

        // return Arrays.stream(newNums).sorted().toArray();
        return newNums;
    }

    public int[] quickSort(int[] nums) {

        return new int[]{2, 4};
    }
}
