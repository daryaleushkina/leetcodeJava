package common.solutions.easy.string;

public class LongestCommonPrefix {

    //  Task 14  https://leetcode.com/problems/longest-common-prefix/
    public static String longestCommonPrefix_1(String[] strs) {
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

    public static String longestCommonPrefix_2(String[] strs) {
        StringBuilder prefix = new StringBuilder(strs[0]);

        boolean flag = false;
        while (!flag) {
            int lastIndex = 0;
            for (int i = 0; i < strs.length; i++) {
                int index = strs[i].indexOf(String.valueOf(prefix));
                if (index == -1 || index > 0) {
                    prefix.deleteCharAt(prefix.length() - 1);
                    if (String.valueOf(prefix) == "")
                        return String.valueOf(prefix);
                    break;
                }
                lastIndex ++;
            }
            flag = lastIndex == strs.length;
        }

        return String.valueOf(prefix);
    }
}
