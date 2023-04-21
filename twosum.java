import java.util.*;


/*
Problem 1: Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
- 2 <= nums.length <= 104
- -109 <= nums[i] <= 109
- -109 <= target <= 109
- Only one valid answer exists.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //TODO
    }
}

public class TwoSumTest {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        int[] result1 = sol.twoSum(nums1, target1);
        System.out.println(Arrays.equals(result1, expected1)); // Expected output: true
        
        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};
        int[] result2 = sol.twoSum(nums2, target2);
        System.out.println(Arrays.equals(result2, expected2)); // Expected output: true
        
        // Test case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};
        int[] result3 = sol.twoSum(nums3, target3);
        System.out.println(Arrays.equals(result3, expected3)); // Expected output: true
    }
}
