// Problem: Final Value of Variable After Performing Operations
// Link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
// Difficulty: Easy
// Approach: Linear scan - check if operation contains '+' or '-'
// Time: O(n) | Space: O(1)

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("--X") || operations[i].equals("X--")) {
                X = X - 1;
            }
            if (operations[i].equals("X++") || operations[i].equals("++X")) {
                X = X + 1;
            }
        }
        return X;
    }
}