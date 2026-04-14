//Platform:LeetCode
//Approach:First of all we take variable sign storing 1 for positive value. After that we traverse the array elements and check is there any elements is zero.
//If is it, then we return sign 0 otherwise we transform again again sign positive to negative or negative to positive at every traverse elements value. and return it.
//Time Compelxity:O(n)
//Space Complexity:O(1)
//Code--
class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for(int n:nums){
            if(n == 0){
                sign = 0;
            }
            if(n < 0){
                sign *= -1;
            }
        }
        return sign;
    }
}
