//Platform:LeetCode
//Approach:Convert the string into a character array, reverse the first k characters in every 2k block using the two-pointer technique, and then convert the array back to a string.
//Time Complexity:O(n)
//Space Complexity:O(n)
class Solution {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i+=2*k){
            int left = i;
            int right = Math.min(i+k-1, c.length-1);
            while(left<right){
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
        return new String(c);
    }
}

