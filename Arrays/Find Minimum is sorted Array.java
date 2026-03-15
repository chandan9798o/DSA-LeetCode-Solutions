//Platform:LeetCode
//Approach:Traversing the array by for loop and compare each element it to the varible first element which is holding array first element. If the increaing 
//element is less than the first value of array we return it.
//Time complexity:O(n)
//Space Complexity:O(1)
//Code--
class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        int min = nums[0];
        int result = 0;
        for(int i=1; i<len; i++){
           if(nums[i] < min){
            int temp = min;
            min = nums[i];
            nums[i] = temp;
           } 
        }
        return min;
    }
}
