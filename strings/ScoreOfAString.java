// Problem: Score of a String
// Link: https://leetcode.com/problems/score-of-a-string/
// Difficulty: Easy
// Approach: Linear scan - sum absolute differences of adjacent ASCII values
// Time: O(n) | Space: O(1)

class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length()-1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            int abv = Math.abs(a - b);
            score = score + abv;
        }
        return score;
    }
}