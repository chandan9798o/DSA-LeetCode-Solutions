// Approach:
// 1. Skip leading spaces
// 2. Determine sign (+/-)
// 3. Convert characters to integer until non-digit appears
// 4. Handle overflow using long
// 5. Return final result
// Time Complexity: O(n)
// Space Complexity: O(1)
//Code--
// Platform: LeetCode

class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1;
        long result = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // 4. Handle overflow
            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * result);
    }
}

