//Platform:GeeksForGeeks
//Approach:We traverse the array and try to find there is no negative number . If not negative number count increasing otherwise count becomes zero and again start form next positive element.
//Time Complexity:O(n)
//Space Complexity:O(1)
//Code--
class Solution {
    public int longestSubarray(int arr[]) {
       int count = 0;
       int maxLen = 0;

       for(int i = 0; i < arr.length; i++) {
           if(arr[i] >= 0) {
               count++;
               maxLen = Math.max(count, maxLen);
           } else {
               count = 0;
           }
       }
       return maxLen;
    }
}
