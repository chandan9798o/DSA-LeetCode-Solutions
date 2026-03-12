//Platform:LeetCode
//Approach: Split the string by spaces, access the last word from the array, and return its length.
//Time Complexity: O(n)
//Space Complexity: O(n)
//Code--
class Solution {
    public int lengthOfLastWord(String s) {
        String [] str = s.split(" ");
        return str[str.length - 1].length();
    }
}
