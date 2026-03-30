// Problem: Move all negative elements to end
// Link: https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
// Difficulty: Easy
// Approach: Use extra array - first store positives, then negatives (maintains order)
// Time: O(n) | Space: O(n)

class Solution {
    public void segregateElements(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                temp[j++] = arr[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                temp[j++] = arr[i];
            }
        }

        System.arraycopy(temp, 0, arr, 0, temp.length);
    }
}
