// File: ValidPalindrome.java
// Problem: Valid Palindrome
// Link: https://leetcode.com/problems/valid-palindrome/
// Difficulty: Easy
// Approach: Clean string (remove non-alphanumeric, lowercase) then use two pointers to compare
// Time: O(n) | Space: O(n)

class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int len = s.length();

        for(int i = 0; i < len / 2; i++){
            if(s.charAt(i) != s.charAt(len - 1 - i)){
                return false;
            }
        }

        return true;
    }
}
