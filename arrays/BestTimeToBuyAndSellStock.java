// File: BestTimeToBuyAndSellStock.java
// Problem: Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Difficulty: Easy
// Approach: Track minimum price so far and calculate maximum profit in one pass
// Time: O(n) | Space: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if((prices[i] - min) > profit){
                profit = prices[i] - min;
            }
        }

        return profit;
    }
}
