package common.solutions.easy.binarysearch;

public class FirstBadVersion {
    int firstBad = 6;
    boolean isBadVersion(int version) {
        return version == firstBad;
    }

    public int firstBadVersion(int n) {
        // Task 278. First Bad Version https://leetcode.com/problems/first-bad-version/
        int left = 1;
        int right = n;
        int mid = left + (right - left) / 2;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (isBadVersion(mid))
                if (!isBadVersion(mid - 1))
                    return mid;
                else right = mid - 1;
            else left = mid + 1;
        }

        return left;
    }
}
