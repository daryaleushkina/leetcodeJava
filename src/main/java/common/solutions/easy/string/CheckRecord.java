package common.solutions.easy.string;

public class CheckRecord {
    // 551. Student Attendance Record I https://leetcode.com/problems/student-attendance-record-i/
    public boolean checkRecord(String s) {
        if (s.indexOf("LLL") >= 0)
            return false;
        short count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A')
                count++;
            if (count >= 2)
                return false;
        }
        return true;

    }
}
