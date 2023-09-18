package common.solutions.easy.string;

public class FinalValueAfterOperations {
    // Task 2011. Final Value of Variable After Performing Operations https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
    public int finalValueAfterOperations(String[] operations) {
        short ans = 0;

        for(String s : operations)
            ans  += (44 - s.charAt(1));

        return ans;
    }
}
