package common.solutions.easy.array;

public class FindNumberswithEvenNumberofDigits {
    // Task 1295. Find Numbers with Even Number of Digits https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] / 100000 > 0 || (nums[i] / 1000 > 0 && nums[i] / 10000 == 0) || (nums[i] / 10 > 0 && nums[i] / 100 == 0))
                count++;
        }
        return count;
    }

}
