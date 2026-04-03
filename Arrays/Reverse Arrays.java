//Platform:LeetCode
//Approach:Two pointer
//Time Complexity:O(n)
//Space Complexity:O(1)
//Code--
class Solution {
    public void reverseArray(int arr[]) {
       int left = 0;
       int right = arr.length-1;
       while(left<=right){
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           left++;
           right--;
       }
    }
}
//Approach:
