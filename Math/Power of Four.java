//Platform:LeetCode
//Approach:A number is a power of four if it is positive, has only one set bit (power of 2), and (n - 1) is divisible by 3.
//Time Complexity:O(1)
//Space Complexity:O(1)
//Code--
class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 
            && (n & (n - 1)) == 0   // power of 2 check
            && (n - 1) % 3 == 0;    // power of 4 check
    }
}
