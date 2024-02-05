package common.solutions.easy.math;

public class IsPerfectSquare {
    // Task 367. Valid Perfect Square https://leetcode.com/problems/valid-perfect-square/description/
    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;
        if (num < 4)
            return false;

        long left = 0;
        long right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long product = mid * mid;
            if (product == num)
                return true;
            else if (product > num)
                right = mid - 1;
            else left = mid + 1;
        }
        return false;

    }
}
