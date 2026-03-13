//Platform:LeetCode
//Approach:Traverse both binary strings from right to left, add digits with a carry, append (sum % 2) to the result, update the carry (sum / 2), and finally reverse the result.
//Time Complexity: O(n)
//Space Complexity: O(n)
//Code--
class Solution {
    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry != 0){
            int sum = carry;

            if(i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
}
