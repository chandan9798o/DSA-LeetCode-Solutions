//Platform:LeetCode
// Approach:
// 1. Get lengths of both strings
// 2. Traverse haystack from 0 to n-m
// 3. Extract substring of length m and compare with needle
// 4. Return index if found, else -1
// Time Complexity: O(n * m)
// Space Complexity: O(m)
//Code--
class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        for(int i = 0; i <= n - m; i++){
            if(haystack.substring(i, i + m).equals(needle)){
                return i;
            }
        }

        return -1;
    }
}
