package common.solutions.easy.string;

public class CountSegments {
    // Task 434. Number of Segments in a String https://leetcode.com/problems/number-of-segments-in-a-string/
    public int countSegments(String s) {
        if (s.isEmpty())
            return 0;
        String[] temp = s.split(" ");
        int ans = 0;
        for (String str : temp)
            if (!str.isEmpty())
                ans++;
        return ans;
    }

}
