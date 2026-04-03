// File: JewelsAndStones.java
// Problem: Jewels and Stones
// Link: https://leetcode.com/problems/jewels-and-stones/
// Difficulty: Easy
// Approach: Brute force - compare each jewel with every stone
// Time: O(n * m) | Space: O(1)

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;

        for(int i = 0; i < jewels.length(); i++){
            char jewe = jewels.charAt(i);

            for(int n = 0; n < stones.length(); n++){
                char ston = stones.charAt(n);

                if(jewe == ston){
                    ans = ans + 1;
                }
            }
        }

        return ans;
    }
}
