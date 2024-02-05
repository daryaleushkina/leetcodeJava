package common.solutions.easy.math;

public class TypeOfTriangleII {
    // Task №3024. Type of Triangle II https://leetcode.com/problems/type-of-triangle-ii/description/
    public String triangleType(int[] nums) {
        if (nums[0] + nums[1] >= nums[2]
                && nums[1] + nums[2] >= nums[0]
                && nums[0] + nums[2] >= nums[1]) {
            if (nums[0] == nums[1] && nums[1] == nums[2])
                return "equilateral";
            else if (nums[0] == nums[1] && nums[1] != nums[2])
                return "isosceles";
            else if (nums[2] == nums[0] && nums[0] != nums[2])
                return "isosceles";
            else if (nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2])
                return "scalene";
        }
        return "none";
    }
}
