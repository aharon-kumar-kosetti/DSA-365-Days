// File: MoveZeroes.java
// Problem: Move Zeroes
// Link: https://leetcode.com/problems/move-zeroes/
// Difficulty: Easy
// Approach: Use extra array - store non-zero elements first, then fill remaining with zeroes
// Time: O(n) | Space: O(n)

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                arr[j++] = nums[i];
            }
        }

        System.arraycopy(arr, 0, nums, 0, n);
    }
}
