package common.solutions.easy.string;

import java.util.LinkedList;
import java.util.List;

public class FindWords {
    // Task 500. Keyboard Row https://leetcode.com/problems/keyboard-row/

    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> ans = new LinkedList<>();

        for (String s : words) {
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int len = s.length();

            for (Character c : s.toLowerCase().toCharArray()) {
                if (row1.indexOf(c) >= 0) {
                    if (count2 > 0 || count3 > 0)
                        break;
                    count1++;
                } else if (row2.indexOf(c) >= 0) {
                    if (count3 > 0 || count1 > 0)
                        break;
                    count2++;
                } else if (row3.indexOf(c) >= 0) {
                    if (count2 > 0 || count1 > 0)
                        break;
                    count3++;
                }
            }
            if (count1 == len || count2 == len || count3 == len)
                ans.add(s);
        }

        String[] arr = new String[ans.size()];

        for (int i = 0; i < ans.size(); i++)
            arr[i] = ans.get(i);

        return arr;
    }

}
