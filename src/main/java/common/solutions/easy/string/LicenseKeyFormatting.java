package common.solutions.easy.string;

import java.util.Arrays;

public class LicenseKeyFormatting {
    // Task 482. License Key Formatting https://leetcode.com/problems/license-key-formatting/
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder ans = new StringBuilder();
        s = s.replaceAll("-", "").toUpperCase();
        int count = s.length();
        ans.append(s);
        if (count % k == 0)
            for (int i = 0; i < count / k - 1; i++)
                ans.insert(k * (i+1) + i, '-');
        else for (int i = 0; i < count / k; i++) {
            if (i == 0)
                ans.insert(count % k, '-');
            else ans.insert((k * i) + i + (count % k), '-');
        }

        return ans.toString().toUpperCase();
    }
}
