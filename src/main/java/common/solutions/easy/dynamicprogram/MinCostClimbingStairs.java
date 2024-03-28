package common.solutions.easy.dynamicprogram;

public class MinCostClimbingStairs {
    // Task №746 Min Cost Climbing Stairs https://leetcode.com/problems/min-cost-climbing-stairs/
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= n; i++)
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);


        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(MinCostClimbingStairs.minCostClimbingStairs(new int[]{0, 1, 1, 0}));
    }
}
