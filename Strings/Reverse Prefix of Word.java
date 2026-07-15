//Platform:LeetCode
//Approach:Using two Pointer
//Time Complextiy:O(n)
//Space Complexity:O(n)

//Code-
class Solution {
    public String reversePrefix(String word, char ch) {
        int k = word.indexOf(ch);
        int left = 0;
        int right = k;
        char[] arr = word.toCharArray();
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
