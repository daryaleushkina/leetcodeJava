package common.solutions.easy.dynamicprogram;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {
    // Task 118. Pascal's Triangle https://leetcode.com/problems/pascals-triangle/
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new LinkedList();
        for (int i = 0; i < numRows; i++){
            List<Integer> temp = new LinkedList();
            for (int j = 0; j < i+1; j++){
                if (j == 0 || j == i)
                    temp.add(1);
                else temp.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            ans.add(temp);
        }
        return ans;

    }
}
