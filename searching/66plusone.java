/*
Problem: Plus One
Platform: LeetCode
Status: Accepted
Approach: Array
Time Complexity: O(n)
Space Complexity: O(n)  (worst case when all digits are 9) and O(1) (best case when no carry is needed)
*/
class Solution {
    public int[] plusOne(int[] digits) {

        // start from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // if digit is not 9, just add 1 and finish
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // if digit is 9, make it 0 and continue carry
            digits[i] = 0;
        }

        // if we reached here, all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
