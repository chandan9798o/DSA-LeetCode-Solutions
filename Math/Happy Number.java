//Platform:LeetCode
//Approach:A Happy Number is found by repeatedly replacing the number with the sum of the squares of its digits 
//and using fast & slow pointers to detect whether it reaches 1 or falls into a cycle.
//Time Complexity:O(log n)
//Space Complexity:O(n)
//Code--
class Solution {
    public boolean isHappy(int n) {
        int sl = n;
        int fa = findSquareSum(n);

        while (fa != 1 && sl != fa) {
            sl = findSquareSum(sl);
            fa = findSquareSum(findSquareSum(fa));
        }

        return fa == 1;
    }

    private int findSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
