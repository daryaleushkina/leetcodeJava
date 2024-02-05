package common.solutions.easy.array;

public class DivideAnArrayIntoSubarraysWithMinimumCostI {
    //Task №3010. Divide an Array Into Subarrays With Minimum Cost I https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/description/
    public int minimumCost(int[] nums) {
        int ans = 0;

        int min1 = 51;
        int min2 = 51;

        if (nums.length == 3)
            ans = nums[0] + nums[1] + nums[2];
        else {
            for (int i = 1; i < nums.length; i++) {
                if (min1 > nums[i]) {
                    min2 = min1;
                    min1 = nums[i];
                } else if (min2 > nums[i]) {
                    min2 = nums[i];
                }

            }
            ans = nums[0] + min1 + min2;
        }
        return ans;
    }
}
