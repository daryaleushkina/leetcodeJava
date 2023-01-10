package common.solutions.easy;

public class ValidParentheses {
//    Task №20 https://leetcode.com/problems/valid-parentheses
    public boolean isValid(String s) {
        StringBuilder ans = new StringBuilder(s);
        while (ans.indexOf("()") > -1 || ans.indexOf("{}") > -1 || ans.indexOf("[]") > -1) {
            if (ans.indexOf("()") > -1)
                ans.replace(ans.indexOf("()"), ans.indexOf("()") + 2, "");
            if (ans.indexOf("[]") > -1)
                ans.replace(ans.indexOf("[]"), ans.indexOf("[]") + 2, "");
            if (ans.indexOf("{}") > -1)
                ans.replace(ans.indexOf("{}"), ans.indexOf("{}") + 2, "");
        }
        return String.valueOf(ans) == "";
    }

}
