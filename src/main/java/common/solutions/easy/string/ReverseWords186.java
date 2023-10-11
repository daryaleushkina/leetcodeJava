package common.solutions.easy.string;

public class ReverseWords186 {
    // Task 186. Reverse Words in a String II  https://leetcode.com/problems/reverse-words-in-a-string-ii/
    public static void reverseWords(char[] s) {
        reverseArray(s, 0, s.length - 1);

        int start = 0;
        for (int end = 0; end < s.length; end++) {
            if (s[end] == ' ') {
                reverseArray(s, start, end - 1);
                start = end + 1;
            }
        }
        reverseArray(s, start, s.length - 1);
    }

    private static void reverseArray(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
