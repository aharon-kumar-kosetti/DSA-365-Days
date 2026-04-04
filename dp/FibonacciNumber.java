// File: FibonacciNumber.java
// Problem: Fibonacci Number
// Link: https://leetcode.com/problems/fibonacci-number/
// Difficulty: Easy
// Approach: Recursion - each number is sum of previous two
// Time: O(2^n) | Space: O(n)

class Solution {
    public int fib(int n) {
        if(n == 1){
            return 1;
        } else if(n == 0){
            return 0;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
