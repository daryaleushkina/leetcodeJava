package common.solutions.easy.array;

public class NumIdenticalPairs {
    // Task 1512. Number of Good Pairs https://leetcode.com/problems/number-of-good-pairs/

    public int numIdenticalPairs(int[] nums) {
        short n = (short) nums.length;
        short count = 0;
        for (short i = 0; i < n; i++)
            for (short j = i; j < n; j++)
                if (nums[i] == nums[j] && i < j)
                    count++;

        return count;
    }
}
