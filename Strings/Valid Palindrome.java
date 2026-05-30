//Platform:LeetCode
//Approach:First, we use two pointers, left and right, starting from the beginning and end of the string. We skip all non-alphanumeric characters from both sides. Then, we compare the characters in a case-insensitive manner by converting them to lowercase. If any pair of characters does not match, we return false. If all characters match while moving the pointers toward the center, we return true.
//Time Complexity:O(n)
//Space Complexity:O(1)

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != 
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
