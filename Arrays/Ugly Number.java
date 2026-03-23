//Platform:LeetCode
//Approach:We make a array which contain 2, 3 and 5 elements and using while loop we chack the given number is divided by 2, 3 and 5 or not and then we update the n to make it 1. We return its value as output.
//Time Complexity:O(log n);
//Space Complexity:O(1)
//Code
class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        int[] factor = {2, 3, 5};
        for(int f:factor){
            while(n%f == 0){
                n/=f;
            }
        }
        return n==1;
    }
}
