//Platform:LeetCode
//Approach:We take the  value of given limitations  and derive mod at every product value and result as output.
//Time Complexity:O(n)
//Space Complexity:O(1)
//Code--

class Solution {
    public static long product(long arr[]) {
        long mod = 1000000007;
        long value = 1;
        for(long n:arr){
            value = (value * n) % mod;
        }
        
        return value;
        
    }
}
