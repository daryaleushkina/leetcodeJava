package common.solutions.easy.math;

public class TribonacciNumber {
    // Task 1137. N-th Tribonacci Number https://leetcode.com/problems/n-th-tribonacci-number/

    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        else if (n <= 2)
            return 1;

        int[] ans = new int[n + 1];
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 1;
        for (int i = 3; i <= n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2] + ans[i - 3];
        }
        return ans[n];

    }
}
