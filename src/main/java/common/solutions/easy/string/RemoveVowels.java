package common.solutions.easy.string;

public class RemoveVowels {
    // Task 1119. Remove Vowels from a String https://leetcode.com/problems/remove-vowels-from-a-string/
    public String removeVowels(String s) {
        s = s.replace("a","");
        s = s.replace("e","");
        s = s.replace("i","");
        s = s.replace("o","");
        s = s.replace("u","");

        return s;
    }
}
