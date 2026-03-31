// File: FindIntersectionValuesOfTwoArrays.java
// Problem: Find Intersection Values of Two Arrays
// Link: https://leetcode.com/problems/find-common-elements-between-two-arrays/
// Difficulty: Easy
// Approach: Brute force - compare each element of one array with the other
// Time: O(n * m) | Space: O(1)

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];

        for (int i : nums1){
            for (int j : nums2){
                if(i == j){
                    ans[0]++;
                    break;
                }
            }
        }

        for (int j : nums2){
            for (int i : nums1){
                if(i == j){
                    ans[1]++;
                    break;
                }
            }
        }

        return ans;
    }
}
