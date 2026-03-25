// Problem: Defanging an IP Address
// Link: https://leetcode.com/problems/defanging-an-ip-address/
// Difficulty: Easy

// Approach 1: Linear scan - check each char, replace '.' with '[.]'
// Time: O(n) | Space: O(n)
// class Solution {
//     public String defangIPaddr(String address) {
//         String ip = "";
//         for (int i = 0; i < address.length(); i++) {
//             char temp = address.charAt(i);
//             if (String.valueOf(temp).equals(".")) {
//                 ip = ip + "[.]";
//             } else {
//                 ip = ip + temp;
//             }
//         }
//         return ip;
//     }
// }

// Approach 2: Built-in String.replace() to swap all '.' with '[.]'
// Time: O(n) | Space: O(n)
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}