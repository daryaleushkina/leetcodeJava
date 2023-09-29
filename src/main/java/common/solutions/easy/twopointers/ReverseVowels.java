package common.solutions.easy.twopointers;

public class ReverseVowels {
    // Task 345. Reverse Vowels of a String https://leetcode.com/problems/reverse-vowels-of-a-string/
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        String vowels = "aeiou";
        char[] arr = s.toCharArray();
        while (left < right) {
            if (vowels.indexOf(Character.toLowerCase(arr[left])) == -1)
                left++;
            if (vowels.indexOf(Character.toLowerCase(arr[right])) == -1)
                right--;

            if (vowels.indexOf(Character.toLowerCase(arr[left])) >= 0 && vowels.indexOf(Character.toLowerCase(arr[right])) >= 0) {
                Character c = arr[left];
                arr[left] = arr[right];
                arr[right] = c;
                right--;
                left++;
            }
        }
        return new String(arr);
    }
}
