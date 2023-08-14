package common.solutions.easy.array;

public class PlusOne {
    //    Task №66. Plus One  https://leetcode.com/problems/plus-one/
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0)
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
                i--;
            }
        int[] array = new int[digits.length + 1];
        array[0] = 1;
        return array;

    }

}
