package common.algorithms.matrixsort;

public class InsertSort {
    public int[] insertSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] < key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }
        return nums;
    }

}
