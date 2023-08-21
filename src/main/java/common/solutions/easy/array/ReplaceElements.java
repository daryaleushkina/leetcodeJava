package common.solutions.easy.array;

public class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        // Task 1299. Replace Elements with Greatest Element on Right Side https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
        int max = -1;
        int prevMax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                prevMax = max;
                max = arr[i];
                arr[i] = prevMax;
            } else  arr[i] = max;
        }

        return arr;
    }
}
