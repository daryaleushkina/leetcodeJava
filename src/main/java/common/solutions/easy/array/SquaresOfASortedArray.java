package common.solutions.easy.array;

import java.util.Arrays;

public class SquaresOfASortedArray {
    // Task 977. Squares of a Sorted Array https://leetcode.com/problems/squares-of-a-sorted-array/

    public int[] sortedSquares(int[] nums) {
        short n = (short) nums.length;
        int[] ans = new int[n];

        short left = 0;
        short right = (short) (n - 1);
        short index = right;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                ans[index] = leftSquare;
                left++;
            } else {
                ans[index] = rightSquare;
                right--;
            }

            index--;
        }

        return ans;
    }
}
