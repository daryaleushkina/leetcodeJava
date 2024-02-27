package common.solutions.medium.prefixsum;

public class ProductOfArrayExceptSelf {
    // Task 238. Product of Array Except Self https://leetcode.com/problems/product-of-array-except-self/
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int countZero = 0;
        int[] ans = new int[n];
        int[] prefix = new int[n + 1];
        int[] suffix = new int[n + 1];
        prefix[0] = 1;
        suffix[n] = 1;

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] * nums[i];
            suffix[n - i - 1] = suffix[n - i] * nums[n - i - 1];
            if (nums[i] == 0) {
                countZero++;
                if (countZero > 1)
                    break;
            }
        }
        for (int i = 0; i < nums.length; i++)
            if (countZero > 1)
                ans[i] = 0;
            else {
                if (i == 0)
                    ans[i] = suffix[i + 1];
                else if (i == n - 1)
                    ans[i] = prefix[i];
                else ans[i] = prefix[i] * suffix[i + 1];
            }


        return ans;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] nums = {0, 0};
        int[] ans = productOfArrayExceptSelf.productExceptSelf(nums);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
