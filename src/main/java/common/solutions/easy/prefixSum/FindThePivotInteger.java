package common.solutions.easy.prefixSum;

public class FindThePivotInteger {
    // Task 2485. Find the Pivot Integer https://leetcode.com/problems/find-the-pivot-integer/
    public int pivotInteger(int n) {
        int leftSum = 0;
        int rightSum = 0;
        int middle = n / 2;
        for (int i = 0; i <= middle; i++)
            leftSum += i;
        for (int i = n; i >= middle; i--)
            rightSum += i;

        while (leftSum < rightSum) {
            rightSum -= middle;
            middle++;
            leftSum += middle;
            if (rightSum == leftSum)
                return middle;
        }

        return -1;


    }
}
