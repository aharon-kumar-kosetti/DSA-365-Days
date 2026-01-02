/*
Problem: Search Insert Position
Platform: LeetCode
Status: Accepted
Approach: Binary Search
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        // same like the ceiling of a number problem
        int start = 0;
        int end = nums.length - 1;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}