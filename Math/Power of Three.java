//Platform:LeetCode
//Approach: Repeatedly divide the number by 2 while it is even. If the final value becomes 1, then it is a power of two.
//TC: O(log n)
//SC: O(1)
//Code-
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        while(n%3 == 0){
            n/=3;
        }
        return (n==1);
    }
}
