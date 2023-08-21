package common.solutions.easy.array;

public class MaxConsecutiveOnes {
    // Task 485. Max Consecutive Ones https://leetcode.com/problems/max-consecutive-ones/
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i<nums.length; i++) {
            if (nums[i]==1)
                count++;
            else {
                if (maxCount<count)
                    maxCount = count;
                count = 0;
            }
        }
        return maxCount < count ? count : maxCount;
    }
}
