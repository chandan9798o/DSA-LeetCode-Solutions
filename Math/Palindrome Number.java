//Platform:LeetCode
//Approach:Simple mathematically reverse number
//Time Complexity : o(log n)
//Space Complexity : o(1)
//Code--
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int reverse = 0;
        int original = x;
        while(x != 0){
            int digit = x %10;
            reverse = reverse *10 + digit;
            x /=10;
        }
        return (reverse == original);
    }

}
