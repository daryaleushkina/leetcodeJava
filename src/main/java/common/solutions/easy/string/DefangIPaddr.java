package common.solutions.easy.string;

public class DefangIPaddr {
    // Task 1108. Defanging an IP Address https://leetcode.com/problems/defanging-an-ip-address/description/
    public String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < address.length(); i++)
            if (address.charAt(i) == '.') {
                ans.append("[");
                ans.append(".");
                ans.append("]");
            } else
                ans.append(address.charAt(i));

        return ans.toString();
    }
}
