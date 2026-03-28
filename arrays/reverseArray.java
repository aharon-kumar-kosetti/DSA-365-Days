// Problem: Reverse an Array
// Link: https://www.geeksforgeeks.org/problems/reverse-an-array/0
// Difficulty: Easy
// Approach: Two pointers - swap elements from start and end moving inward
// Time: O(n) | Space: O(1)

class Solution {
    public void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}
