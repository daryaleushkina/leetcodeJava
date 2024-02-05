package common.solutions.easy.array;

public class SearchInsertPosition {
//    Task 35 https://leetcode.com/problems/search-insert-position
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0])
            return 0;
        else if (target > nums[nums.length - 1])
            return nums.length;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target)
                return i;
            else if (nums[i] < target && target < nums[i + 1])
                return i + 1;
        return 0;

    }
}
