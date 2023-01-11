package common.solutions.medium;

import java.util.Map;

public class IntegerToRoman {

//    Task №12 https://leetcode.com/problems/integer-to-roman
    public String intToRoman(int num) {
        String s = "";
        s = s + "M".repeat(num / 1000);
        if (num % 1000 >= 900) {
            s = s + "CM";
            num -= 900;
        }
        num = num - ((num / 1000) * 1000);

        s = s + "D".repeat(num / 500);
        if (num % 500 >= 400) {
            s = s + "CD";
            num -= 400;
        }
        num = num - ((num / 500) * 500);

        s = s + "C".repeat(num / 100);
        if (num % 100 >= 90) {
            s = s + "XC";
            num -= 90;
        }
        num = num - ((num / 100) * 100);


        s = s + "L".repeat(num / 50);
        if (num % 50 >= 40) {
            s = s + "XL";
            num -= 40;

        }
        num = num - ((num / 50) * 50);

        s = s + "X".repeat(num / 10);
        if (num % 10 == 9) {
            s = s + "IX";
            num -= 9;
        }
        num = num - ((num / 10) * 10);


        s = s + "V".repeat(num / 5);
        if (num % 5 == 4) {
            s = s + "IV";
            num -= 4;

        }
        num = num - ((num / 5) * 5);

        s = s + "I".repeat(num);

        return s;
    }
}
