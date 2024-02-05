package common.solutions.easy.array;

public class RemoveElement {
//    Task 27. Remove Element https://leetcode.com/problems/remove-element/

    public int removeElement(int[] nums, int val) {
        int count = nums.length;
        int i = 0;
        while (i < count) {
            if (nums[i] == val) {
                nums[i] = nums[count-1];
                count--;
            } else {
                i++;
            }
        }
        return count;
    }
}
