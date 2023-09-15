package common.solutions.medium;

import java.util.ArrayList;
import java.util.Map;

public class IntegerToRoman {

    //    Task №12. Integer to Roman https://leetcode.com/problems/integer-to-roman
    public String intToRoman(int num) {
        String[] roman = new String[]{"M", "D", "C", "L", "X", "V", "I",};
        int[] nums = new int[]{1000, 500, 100, 50, 10, 5, 1};

        String s = "";
        for (int i = 0; i < nums.length; i++) {
            int count = num / nums[i];
            num -= count * nums[i];
            s = s + roman[i].repeat(count);

            switch (roman[i]) {
                case "C": case "M": case "X":
                    if (num % nums[i] >= nums[i] - nums[i + 2]) {
                        s += roman[i + 2] + roman[i];
                        num -= nums[i] - nums[i + 2];
                    }
                    break;
                case "D": case "L": case "V":
                    if (num % nums[i] >= nums[i] - nums[i + 1]) {
                        s += roman[i + 1] + roman[i];
                        num -= nums[i] - nums[i + 1];
                    }
                    break;
            }
        }
        return s;
    }
}
