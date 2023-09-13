package common.solutions.easy.bitmanipulation;

public class CountBits {
    // Task 338. Counting Bits https://leetcode.com/problems/counting-bits/description/
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            int tempCount = 0;
            int num = i;
            while (num > 0) {
                tempCount += num & 1;
                num >>= 1;
            }
            ans[i] = tempCount;
        }
        return ans;
    }
}
