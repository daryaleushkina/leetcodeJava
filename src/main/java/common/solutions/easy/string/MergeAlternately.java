package common.solutions.easy.string;

public class MergeAlternately {
    // 1768. Merge Strings Alternately https://leetcode.com/problems/merge-strings-alternately/
    public String mergeAlternately(String word1, String word2) {

        int minLen = word1.length() <= word2.length() ? word1.length() : word2.length();

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }

        if (word1.length() > minLen)
            ans.append(word1.substring(minLen + 1));
        else if (word2.length() > minLen)
            ans.append(word2.substring(minLen + 1));
        return ans.toString();
    }
}
