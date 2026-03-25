//Platform:LeetCode
//Approach:I use two pointer left and right to reverse the each character in String array elements using while loop
//Space Complexity:O(1)
//Time Complexity:O(n)
//Code--
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
