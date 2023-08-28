package common.solutions.easy.bitmanipulation;

public class IsPowerOfTwo {
    // Task 231. Power of Two https://leetcode.com/problems/power-of-two/description/
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1)
                count++;
            n >>= 1;
        }
        if (count == 1)
            return true;
        return false;
        // if (n <= 0)
        //     return false;
        // while (n>=2)
        //     if (n%2 != 0)
        //         return false;
        //     else n/=2;
        // return true;
    }
}
