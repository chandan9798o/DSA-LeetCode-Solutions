// Platform: LeetCode

// Approach:
// First, we calculate the total sum of all elements in the array.
// Then we iterate through the array while maintaining a variable 'leftSum'.
// For each index, we calculate the right sum using:
// rightSum = totalSum - leftSum - nums[i]
//
// If leftSum equals rightSum, we return that index as the pivot index.
// Otherwise, we update leftSum by adding nums[i] and continue.
// If no such index is found, we return -1.

// Time Complexity: O(n)
// Space Complexity: O(1)
//Code--
class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int totalSum = 0;
        for(int n:nums){
            totalSum+=n;
        }
        for(int i=0; i<nums.length; i++){
            int rightSum = totalSum -leftSum - nums[i];

            if(leftSum == rightSum){
                return i;
            }
            leftSum +=nums[i];
        }
        return -1;
    }
}
