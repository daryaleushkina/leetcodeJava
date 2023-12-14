package common.solutions.medium.matrix;

import java.util.List;

// Task 841. Keys and Rooms https://leetcode.com/problems/keys-and-rooms
public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] ans = new boolean[n];
        dfs(rooms, 0, ans);
        for (int i = 0; i < n; i++)
            if (!ans[i])
                return false;

        return true;
    }

    public void dfs(List<List<Integer>> arr, int num, boolean[] ans) {
        if (ans[num])
            return;
        ans[num] = true;

        if (arr.get(num).isEmpty())
            return;

        for (int i = 0; i < arr.get(num).size(); i++)
            dfs(arr, arr.get(num).get(i), ans);
        return;
    }
}
