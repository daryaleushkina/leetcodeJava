package common.solutions.easy;

public class IsPowerOfThree {
    // Task 326. Power of Three https://leetcode.com/problems/power-of-three
    public boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        while (n > 0) {
            if (n == 1)
                return true;
            else if (n % 3 != 0)
                return false;
            n = n / 3;
        }
        return true;
    }
}
