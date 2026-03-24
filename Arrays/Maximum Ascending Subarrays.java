//Platform:LeetCode
//Appraoch:1.We make two variable currentSum and maxSum which store first element of arrays. After that we check the element is greater than its previous 
//element or not. If yes we update the current sum and return it.Simple Linear Traversing
//Time complexity:O(n)
//Space Complexity:O(1)
//Code--
class Solution {
    public int maxAscendingSum(int[] nums) {
      int currentSum = nums[0];
      int maxSum = nums[0];
      for(int i=1; i<nums.length; i++){
        if(nums[i] > nums[i-1]){
            currentSum +=nums[i];
        } else{
            currentSum = nums[i];
        }
        maxSum = Math.max(maxSum, currentSum);
      }
      return maxSum;
    }
}
