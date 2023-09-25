package common.solutions.easy.simulation;

public class FindPoisonedDuration {
    // Task 495. Teemo Attacking https://leetcode.com/problems/teemo-attacking/description/
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i] < timeSeries[i + 1] - duration)
                ans += duration;
            else ans += (timeSeries[i + 1] - timeSeries[i]);
        }
        return ans + duration;
    }
}
