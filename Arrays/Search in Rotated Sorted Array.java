//Platform: LeetCode
//Approach:Simple linear Search
//Time Complexity : O(n)
//Space Complexity : O(1)
//Code --
class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int val = -1;
        for(int i=0; i<len; i++){
            if(nums[i] == target){
                val = i;
            }
        }
        return val;
    }
}
