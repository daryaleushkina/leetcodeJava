package common.solutions.easy.array;

public class MonotonicArray {
    // Task 896. Monotonic Array https://leetcode.com/problems/monotonic-array/
    public boolean isMonotonic(int[] nums) {
        boolean sign = nums[0] < nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i] && sign)
                return false;
            if (nums[i - 1] < nums[i] && !sign)
                return false;
        }

        return true;
    }
}
