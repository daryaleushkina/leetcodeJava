package common.solutions.easy.prefixSum;

public class PivotIndex {
    // Task 724. Find Pivot Index https://leetcode.com/problems/find-pivot-index
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] sumLeft = new int[n];
        int[] sumRight = new int[n];
        if (nums.length == 1)
            return 0;
        sumLeft[1] = nums[0];
        sumRight[n-2] = nums[n-1];
        for (int i = 2; i < n; i++)
            sumLeft[i] = sumLeft[i-1]+nums[i-1];
        for (int i = n-3; i >= 0; i--)
            sumRight[i] = sumRight[i+1] + nums[i+1];
        for (int i = 0; i < n; i++)
            if (sumLeft[i]== sumRight[i])
                return i;




        return -1;
    }
}
