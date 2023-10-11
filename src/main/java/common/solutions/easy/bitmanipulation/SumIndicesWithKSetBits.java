package common.solutions.easy.bitmanipulation;
import java.util.List;

public class SumIndicesWithKSetBits {
    // Task 2859. Sum of Values at Indices With K Set Bits https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.size(); i++) {
            byte tempCount = 0;
            int copy = i;
            while(copy > 0) {
                tempCount+= copy & 1;
                copy >>= 1;
                if (tempCount > k)
                    break;
            }
            if (tempCount == k)
                ans+=nums.get(i);
        }
        return ans;
    }
}
