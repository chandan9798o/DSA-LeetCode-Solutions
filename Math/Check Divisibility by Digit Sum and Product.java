//Platform:LeetCode
//Approach:First of all i try to extract digit for store add and product value in certain variable after storing original given value and in last we return
//its operation of divisibility with sum and prodcut of given number in boolean form.
//Time Complexity:O(logn)
//Space Complexity:O(n)

//Code-
class Solution {
    public boolean checkDivisibility(int n) {
        int ori = n;
        int s = 0;
        long p = 1;
        while(n > 0){
            int digit = n % 10;
            s+=digit;
            p*=digit;
            n = n/10;
        }
        return ori % (s+p) == 0;
    }
}
  
