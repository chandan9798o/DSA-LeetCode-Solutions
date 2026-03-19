//Platform:LeetCode
//Approach:We use simple Sorting method and store the value in ans and return it
//Time complexity:O(1)
//Space Complexity:O(1)
//Code--
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        int ans = nums[len-k];
        return ans;
    }
}
