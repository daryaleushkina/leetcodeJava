package common.solutions.easy.array;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
    // Task 697. Degree of an Array https://leetcode.com/problems/degree-of-an-array/
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (max < map.get(nums[i]))
                max = map.get(nums[i]);
        }
        if (max == 1)
            return 1;
        int ans = nums.length;

        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                int left = 0;
                int right = nums.length - 1;
                while (nums[left] != key)
                    left++;
                while (nums[right] != key)
                    right--;
                ans = Math.max(ans, right - left + 1);
            }
        }
        return ans;
    }
}
