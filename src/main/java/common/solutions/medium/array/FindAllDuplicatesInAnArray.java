package common.solutions.medium.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicatesInAnArray {

    // Task 442. Find All Duplicates in an Array https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (table.get(nums[i]) != null) {
                table.put(nums[i], table.get(nums[i]) + 1);
                if (table.get(nums[i]) == 2)
                    ans.add(nums[i]);
            } else table.put(nums[i], 1);
        }
        return ans;
    }
}
