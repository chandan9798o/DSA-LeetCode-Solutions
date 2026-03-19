//Platform:LeetCode
//Appraoch:“Using binary search, we exploit the pairing pattern and eliminate half of the array in each step.”
//Time Complexity:O(log n)
//Space Complexity:O(1)
//Code--
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while(left < right){
            int mid = (left + right) / 2;
            if(mid % 2 == 1){
                mid--;
            }

            if(nums[mid] == nums[mid + 1]){
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}
