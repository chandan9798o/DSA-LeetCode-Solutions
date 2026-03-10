//Platform:LeetCode
//Approach:Control Overflow using Integer.Min_Value and then return accurate quotient
//Space Complexity:O(1)
//Time Complexity:O(1)
//Code--
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        return dividend / divisor;
    }
}
