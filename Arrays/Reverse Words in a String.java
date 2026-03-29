//Platform:LeetCode
//Approach:First of all we split it into array format and use two pointer to reverse its each word in while loop and then store its result again in string with added space between them.
//Time Complexity:O(n);
//Space Complexity:O(1);
//Code--
class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split("\\s+");
        int left = 0;
        int right = a.length-1;
        while(left<right){
            String temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }  
        String result = String.join(" ", a);
        return result;
        }
}
