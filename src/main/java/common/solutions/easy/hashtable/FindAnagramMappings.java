package common.solutions.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class FindAnagramMappings {
    //Task 760. Find Anagram Mappings https://leetcode.com/problems/find-anagram-mappings/
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < n; i++)
            map.put(nums2[i], i);
        int[] mapping = new int[n];
        for (int i = 0; i < n; i++)
            mapping[i] = map.get(nums1[i]);
        return mapping;
    }
}
