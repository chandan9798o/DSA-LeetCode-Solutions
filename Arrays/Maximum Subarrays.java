//Platform:LeetCode
//Approach:We take two variables sum and maxSum, where maxSum is initialized with the first element. Traverse the array, add each element to sum, update maxSum if sum is larger, and reset sum to 0 if it becomes negative.
//Time Complexity: O(n)
//Space Complexity: O(1)
//code:
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        for(int i=0; i<nums.length; i++){
            sum +=nums[i];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
