// Problem: Rotate Array by K Positions to the Right
// Link: https://leetcode.com/problems/rotate-array/
// Difficulty: Medium
// Approaches:
// 1) Extra Array (direct index mapping)
// 2) Reversal Algorithm (in-place optimized)
// Time: O(n) | Space: O(n) / O(1)

class Solution {

    // ---------- Approach 1: Extra Array ----------
    // Simple and intuitive
    public void rotateExtra(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            arr[newIndex] = nums[i];
        }

        System.arraycopy(arr, 0, nums, 0, n);
    }

    // ---------- Approach 2: Reversal Algorithm ----------
    // Optimized in-place solution
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);   // step 1
        reverse(nums, 0, k - 1);   // step 2
        reverse(nums, k, n - 1);   // step 3
    }

    // Helper function
    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
