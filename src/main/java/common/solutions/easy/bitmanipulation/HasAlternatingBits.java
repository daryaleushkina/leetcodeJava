package common.solutions.easy.bitmanipulation;

public class HasAlternatingBits {
    // 693. Binary Number with Alternating Bits https://leetcode.com/problems/binary-number-with-alternating-bits/
    public boolean hasAlternatingBits(int n) {
        int prevDigit = -1;
        while (n > 0) {
            int temp = n & 1;
            if (prevDigit == temp)
                return false;
            else {
                prevDigit = n & 1;
                n >>= 1;
            }
        }
        return true;
    }
}
