// Problem: Rotate Array by One Position to the Right
// Link: https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
// Difficulty: Easy
// Approach: Store last element and shift all elements right by one
// Time: O(n) | Space: O(1)

class Solution {
    public void rotate(int[] arr) {
        int i = arr.length - 1;
        int temp = arr[arr.length - 1];

        while (i > 0) {
            arr[i] = arr[i - 1];
            i--;
        }

        arr[0] = temp;
    }
}
