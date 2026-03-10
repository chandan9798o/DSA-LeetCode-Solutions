//Platform:LeetCode
//Approach:We find the square root of the given number using the `Math.sqrt()` function. Since `Math.sqrt()` returns a double value, we cast the result to an integer to remove the decimal part.
//Time Complexity:O(1)
//Space Complexity:O(1)
//Code-
class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}
