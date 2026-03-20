//Platform:LeetCode
// Approach:
// 1. Check if lengths are equal
// 2. Convert strings to char arrays
// 3. Sort both arrays
// 4. Compare both arrays
// Time Complexity: O(n log n)
// Space Complexity: O(n)
//Code--
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char [] a = s.toCharArray(); 
        char [] b = t.toCharArray(); 
        Arrays.sort(a); 
        Arrays.sort(b); 
        return Arrays.equals(a, b);

    }
}
