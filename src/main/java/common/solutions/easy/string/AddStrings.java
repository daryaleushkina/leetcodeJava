package common.solutions.easy.string;

public class AddStrings {
    // Task 415. Add Strings https://leetcode.com/problems/add-strings
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int balance = 0;
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;

        while (l1 >= 0 || l2 >= 0 || balance != 0) {
            int d1 = l1 >= 0 ? num1.charAt(l1) - '0' : 0;
            int d2 = l2 >= 0 ? num2.charAt(l2) - '0' : 0;
            int value = (d1 + d2 + balance) % 10;
            balance = (d1 + d2 + balance) / 10;
            result.append(value);
            l1--;
            l2--;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(AddStrings.addStrings("11","13"));
    }
}
