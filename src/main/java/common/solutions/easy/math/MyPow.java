package common.solutions.easy.math;

public class MyPow {
    // Task №50. Pow(x, n) https://leetcode.com/problems/powx-n/description/
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;

        double ans = 1;
        long absN = Math.abs((long) n);

        while (absN > 0) {
            if (absN % 2 == 1) {
                ans *= x;
            }

            x *= x;
            absN /= 2;
        }

        return n < 0 ? 1 / ans : ans;

    }

}
