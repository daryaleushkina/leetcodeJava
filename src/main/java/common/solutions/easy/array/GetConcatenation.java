package common.solutions.easy.array;

public class GetConcatenation {
    // Task 1929. Concatenation of Array https://leetcode.com/problems/concatenation-of-array/

    public int[] getConcatenation(int[] nums) {
        short n = (short) nums.length;
        int[] ans = new int[2 * n];
        for (short i = 0; i < n; i++) {
            ans[i] = (short) nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
