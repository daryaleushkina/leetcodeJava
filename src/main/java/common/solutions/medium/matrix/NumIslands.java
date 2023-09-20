package common.solutions.medium.matrix;

public class NumIslands {
    // Task 200. Number of Islands https://leetcode.com/problems/number-of-islands/description/
    public int numIslands(char[][] binaryMatrix) {
        if (binaryMatrix == null || binaryMatrix.length == 0) {
            return 0;
        }
        int numRows = binaryMatrix.length;
        int numCols = binaryMatrix[0].length;
        int[][] grid = new int[binaryMatrix.length][binaryMatrix[0].length];

        for (int row = 0; row < numRows; row++)
            for (int col = 0; col < numCols; col++)
                if (binaryMatrix[row][col] == '1')
                    grid[row][col] = 1;


        int islandCount = 0;


        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (grid[row][col] == 1) {
                    islandCount++;
                    dfs(grid, row, col);
                }
            }
        }

        return islandCount;
    }

    private void dfs(int[][] grid, int row, int col) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        if (row < 0 || row >= numRows || col < 0 || col >= numCols || grid[row][col] == 0) {
            return;
        }

        grid[row][col] = 0;

        dfs(grid, row - 1, col);
        dfs(grid, row + 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row, col + 1);
    }
}
