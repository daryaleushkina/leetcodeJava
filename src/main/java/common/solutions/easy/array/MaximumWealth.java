package common.solutions.easy.array;

public class MaximumWealth {
    //Task 1672. Richest Customer Wealth https://leetcode.com/problems/richest-customer-wealth/submissions/
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int tempSum = 0;
            for (int j = 0; j < accounts[i].length; j++)
                tempSum += accounts[i][j];
            if (tempSum > max)
                max = tempSum;
        }
        return max;
    }
}
