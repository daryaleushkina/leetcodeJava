package common.solutions.medium.matrix;

// Task 547 Number of Provinces https://leetcode.com/problems/number-of-provinces/
public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        for (int i = 0; i < isConnected.length; i++)
            for (int j = 0; j < isConnected[0].length; j++) {
                count += dfs(isConnected, i, j);
            }
        return count;
    }

    public int dfs(int[][] arr, int row,int col) {
        int numRows = arr.length;
        int numCols = arr[0].length;

        if (row < 0 || row >= numRows || col < 0 || col >= numCols || arr[row][col] == 0)
            return 0 ;

        arr[row][col] = 0;
        arr[col][row] = 0;

        for (int i = 0; i < numCols; i++)
            dfs(arr, col, i );
        return 1;
    }
}
/*

[[1,0,0,1],
 [0,1,1,0],
 [0,1,1,1],
 [1,0,1,1]]
 */