package common.solutions.easy;

public class LongestCommonPrefix {

//  Task №14  https://leetcode.com/problems/longest-common-prefix/
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            temp.append(strs[0].charAt(i));
            boolean flag = true;
            for (int j = 0; j < strs.length; j++) {
                int index = strs[j].indexOf(String.valueOf(temp));
                if (index == -1 || index > 0) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                prefix.append(strs[0].charAt(i));
            else return String.valueOf(prefix);
        }

        return String.valueOf(prefix);
    }
}
