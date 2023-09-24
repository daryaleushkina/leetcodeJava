package common.solutions.easy.string;

import java.util.LinkedList;
import java.util.List;

public class ToGoatLatin {
    // Task 824. Goat Latin https://leetcode.com/problems/goat-latin/
    public String toGoatLatin(String sentence) {
        String let = "aeiou";
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++)
            if (let.indexOf(Character.toLowerCase(words[i].charAt(0))) >= 0)
                words[i] = words[i] + "ma";
            else
                words[i] = words[i].substring(1) + words[i].charAt(0);

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i] + "a".repeat(i+1);
            ans.append(words[i]);
            if (i != words.length - 1)
                ans.append(" ");

        }

        return ans.toString();


    }
}
