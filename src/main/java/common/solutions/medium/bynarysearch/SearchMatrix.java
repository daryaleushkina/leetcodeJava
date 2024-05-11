package common.solutions.medium.bynarysearch;

public class SearchMatrix {
    // Task 74. Search a 2D Matrix https://leetcode.com/problems/search-a-2d-matrix/
    public boolean searchMatrix(int[][] matrix, int target) {
        byte row = 0;
        byte col = (byte) (matrix[0].length - 1);

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] < target)
                row++;
            else
                col--;
        }

        return false;
    }
}
