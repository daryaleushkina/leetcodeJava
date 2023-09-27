package common.solutions.easy.hashtable;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    // Task 575. Distribute Candies https://leetcode.com/problems/distribute-candies/
    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>();
        for (int type : candyType)
            types.add(type);
        int count = candyType.length / 2;
        if (types.size() > count)
            return count;
        else return types.size();
    }
}
