package common.solutions.easy.array;

public class ValidMountainArray {
    //    Task 941. Valid Mountain Array https://leetcode.com/problems/valid-mountain-array/
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3 || arr[0] >= arr[1])
            return false;
        boolean flag = true;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
            else if (arr[i + 1] < arr[i] && arr[i - 1] < arr[i] && flag)
                flag = false;
            else if (arr[i + 1] > arr[i] && !flag)
                return false;
        }

        return !flag;

    }
}
