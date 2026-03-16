//Platofrm:LeetCode
//Approach: Repeatedly divide the number by 2 while it is even; 
//if the final value becomes 1, then it is a power of two.
//TC: O(log n)
//SC: O(1)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        while(n%2 == 0){
            n/=2;
        }
        return (n==1);
    }
}
