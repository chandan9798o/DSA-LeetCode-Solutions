//Platform:LeetCode
//Approach:In this problem i traverse the array elements using for loop and then i store a single element in string valriable. After that using 
//Two pointer left and right i make a funcntion is palindrome to check each element is palindrome or not using while loop. If it is then break the statement 
// and return as output.
//Time Complexity:O(n)
//Space Complexity:O(1)

//Code-
class Solution {
    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            int left = 0, right = s.length() - 1;

            boolean isPalindrome = true;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                return s;
            }
        }

        return "";
    }
}
