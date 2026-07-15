//Platform:LeetCode
//Approach:Two pointer Approach
//Time Complexity:O(n)
//Space Complexity:O(n)

//Code--
class Solution {
    public String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = k-1;
        while(left <= right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String str = new String(arr);
        return str;
    }
}
