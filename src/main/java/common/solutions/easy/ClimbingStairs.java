package common.solutions.easy;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

}


//        1 - 1
//        2 - 2
//        3 - 3
//        4 - 5 1111 211 121 112 22
//        5 - 8 11111 2111 1211 1121 1112 221 122 212
//        6 - 13 111111 21111 12111 11211 11121 11112 2211 2121 2112 1221 1212 1122 222

