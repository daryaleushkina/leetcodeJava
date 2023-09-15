package common.solutions.medium.dynamicprogramming;

public class MinDistance {
    // Task 583. Delete Operation for Two Strings https://leetcode.com/problems/delete-operation-for-two-strings/
    public int minDistance(String word1, String word2) {
        short m = (short) word1.length();
        short n = (short) word2.length();
        short[][] ans = new short[m + 1][n + 1];

        for (short i = 0; i <= m; i++) {
            for (short j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    ans[i][j] = (short) (i + j);
                else if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    ans[i][j] = ans[i - 1][j - 1];
                else
                    ans[i][j] = (short) (Math.min(ans[i - 1][j], ans[i][j - 1]) + 1);
            }
        }

        return ans[m][n];
    }
}
