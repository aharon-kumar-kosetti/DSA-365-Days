// Problem: Find Minimum and Maximum in an Array
// Link: https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
// Difficulty: Easy
// Approach: Linear scan - track min and max in a single pass
// Time: O(n) | Space: O(1)

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        ArrayList<Integer> Values = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        Values.add(min);
        Values.add(max);
        return Values;
    }
}
