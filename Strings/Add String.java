//Platform:LeetCode
//Approach:Two Pointer + Carry Simulation
//Time Complexity:O(max(m, n))
//Space Complexity:O(max(m, n))

//Code--
import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        if(num1.equals("0") && num2.equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        while(i>=0 || j>=0 || carry > 0){
            int digit1 = (i>=0) ? num1.charAt(i)-'0' : 0;
            int digit2 = (j>=0) ? num2.charAt(j)-'0' : 0;
            int sum = digit1 + digit2 + carry;
            int digit = sum %10;
            carry = sum/10;
            sb.append(digit);
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
