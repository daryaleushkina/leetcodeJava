package common.solutions.easy.math;

import java.util.function.Predicate;


public class CategorizeBoxAccordingToCriteria {
    // Task 2525. Categorize Box According to Criteria https://leetcode.com/problems/categorize-box-according-to-criteria/description/
    public String categorizeBox(int length, int width, int height, int mass) {
        int v = length * width * mass;
        Predicate<Integer> checkSide = val -> val > 100000;
        Predicate<Integer> checkV = val -> val > Math.pow(10, 9);
        if (checkSide.test(length) || checkSide.test(width) || checkSide.test(length) || checkV.test(v))
            if (mass > 100)
                return ("Heavy");
            else
                return ("Bulky");
        else if (mass > 100)
            return ("Heavy");
        else return ("Neither");


    }
}
