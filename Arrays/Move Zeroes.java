//Platform:LeetCode
//Scan the array and whenever a non-zero element is found, swap it with the element at the next non-zero position (j) to shift all zeros to the end.
//Time Complexity: O(n) 
//Space Complexity: O(1)
//Code--
class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int j=0;
        for(int i=0; i<len; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
