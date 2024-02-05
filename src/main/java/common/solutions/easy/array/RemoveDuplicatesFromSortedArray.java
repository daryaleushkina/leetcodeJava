package common.solutions.easy.array;

public class RemoveDuplicatesFromSortedArray {
//    Task 26. Remove Duplicates from Sorted Array https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }

        return k + 1;
    }
}
