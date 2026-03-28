//Platform:LeetCode
//Approach:We use three pointer (low, mid, high) to partition the array into three regions and sort it in one pass.
//Time Complexity:O(n)
//Space Complexity:O(1)
//Code--
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if(nums[mid] == 1){
                mid++;
            } else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
