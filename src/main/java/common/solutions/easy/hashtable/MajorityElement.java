package common.solutions.easy.hashtable;

import java.util.HashMap;
import java.util.Map;



public class MajorityElement {
    // Task 169. Majority Element https://leetcode.com/problems/majority-element/
    public int majorityElement(int[] nums) {

        int count = 0;
        int ans = 0;

        for (int num : nums) {
            if (count == 0)
                ans = num;

            if (num == ans)
                count++;
            else
                count--;

        }

        return ans;


//        Map<Integer, Integer> map = new HashMap();
//        int n = nums.length;
//
//        for (int i = 0; i < n; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//            if (map.get(nums[i]) > n / 2)
//                return nums[i];
//        }
//        for (Integer key : map.keySet()) {
//            if (map.get(nums[key]) > n / 2)
//                return key;
//        }
//
//        return 1;

    }
}
