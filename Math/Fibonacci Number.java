//Platform:LeetCode
//Approach:In this problem, first of all we handle the case for n = 0 and 1 we return 0 and 1 as output. After that using for loop we initialize the value from 2 to equal or less than
//given integer and make the fibonacci series. In last we return the update b as outout.

//Time Complexity:O(n)
//Space Complexity:O(1)

//Code-
class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int a = 0;
        int b = 1;
        for(int i=2; i<=n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
        
    }
}
