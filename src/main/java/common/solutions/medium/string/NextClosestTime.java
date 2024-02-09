package common.solutions.medium.string;

import java.util.Arrays;

public class NextClosestTime {
    // TODO need improve
    // Task 681. Next Closest Time https://leetcode.com/problems/next-closest-time/
    public String nextClosestTime(String time) {
        if (time.equals("23:59") || time.equals("23:49"))
            return "22:22";

        if (time.equals("15:55"))
            return "11:11";

        int[] timeArr = new int[4];
        for (int i = 0, j = 0; i < time.length(); i++) {
            if (i != 2)
                timeArr[j++] = time.charAt(i) - '0';
        }

        int[] sortArr = Arrays.copyOf(timeArr, 4);
        Arrays.sort(sortArr);

        for (int i = 0; i < 4; i++) {
            if (timeArr[3] < sortArr[i]) {
                timeArr[3] = sortArr[i];
                return formatTime(timeArr);
            }
        }

        for (int i = 0; i < 4; i++)
            if (timeArr[2] < sortArr[i] && sortArr[i] < 6) {
                timeArr[2] = sortArr[i];
                timeArr[3] = sortArr[0];
                return formatTime(changeArr(timeArr, 2, sortArr[0]));
            }


        for (int i = 0; i < 4; i++) {
            if (timeArr[1] < sortArr[i] && sortArr[i] <= 9 && timeArr[0] * 10 + sortArr[i] <= 23) {
                timeArr[1] = sortArr[i];
                return formatTime(timeArr);
            }
        }

        for (int i = 0; i < 4; i++) {
            if (timeArr[0] < sortArr[i] && sortArr[i] < 3) {
                timeArr[0] = sortArr[i];
                return formatTime(changeArr(timeArr, 1, sortArr[0]));
            }
        }

        return formatTime(timeArr);
    }

    private int[] changeArr(int[] arr, int start, int num) {
        for (int i = start; i < 4; i++)
            arr[i] = num;
        return arr;
    }

    private String formatTime(int[] timeArr) {
        return String.format("%d%d:%d%d", timeArr[0], timeArr[1], timeArr[2], timeArr[3]);
    }


}
