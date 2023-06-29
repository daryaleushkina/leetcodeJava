package common.solutions.easy;

public class FirstBadVersion {
    boolean isBadVersion(int version) {
        return version % 2 == 0;
    }

    public int firstBadVersion(int n) {
        int current = n;
        int first = -1;
        boolean flag = true;
        while (flag) {
            if (isBadVersion(current)) {
                first = current;
                current--;
            } else if (first == -1) {
                current++;
            } else break;
        }
        return first;
    }
}
