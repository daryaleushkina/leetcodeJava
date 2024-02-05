package common.solutions.easy.math;

public class GuessNumberHigherOrLower {
    // Task 374. Guess Number Higher or Lower https://leetcode.com/problems/guess-number-higher-or-lower/description/
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int mid =left + (right - left)/2;
        while (left <= right){
            mid = left + (right - left)/2;
            if (guess(mid) == 0)
                return mid;
            if (guess(mid) == -1)
                right = mid -1;
            else left = mid+1;
        }

        return mid;
    }
    int pick = 6;

    private int guess(int mid) {
        if (mid == pick)
            return 0;
        else if (mid > pick)
            return  -1;
        else return 1;
    }
}
