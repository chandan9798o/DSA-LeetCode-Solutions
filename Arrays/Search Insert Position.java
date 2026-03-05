//Platform:LeetCode
//Approach: Simple Linear Search
//Time Complexity: O(n)
//Space Complexity: O(1)
//Code--
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}
