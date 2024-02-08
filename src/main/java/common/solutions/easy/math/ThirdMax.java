package common.solutions.easy.math;

public class ThirdMax {
    // Task 414. Third Maximum Number https://leetcode.com/problems/third-maximum-number/
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        if (nums.length == 1)
            return nums[0];
        else if (nums.length == 2)
            return nums[0] > nums[1] ? nums[0] : nums[1];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2 && nums[i] != max1) {
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] > max3 && nums[i] != max2 &&  nums[i] != max1) {
                max3 = nums[i];
            }
        }
        return max3 == Long.MIN_VALUE ? Math.toIntExact(max1) : Math.toIntExact(max3);
    }
}
