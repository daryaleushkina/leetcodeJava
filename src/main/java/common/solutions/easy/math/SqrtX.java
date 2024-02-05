package common.solutions.easy.math;

public class SqrtX {

    // Task 69. Sqrt(x) https://leetcode.com/problems/sqrtx/
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        long left = 0;
        long right = x;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long product = mid * mid;
            if (product == x)
                return (int) mid;
            else if (product > x)
                right = mid - 1;
            else
                left = mid + 1;

        }
        return (int) right;
    }
}
