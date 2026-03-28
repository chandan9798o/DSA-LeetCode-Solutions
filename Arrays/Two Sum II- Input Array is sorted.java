//Platform:LeetCode
//Approach:Two Pointer method
//Time  Complexity:O(n)
//Space Complexity:O(1)
//Code--
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left<=right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                return new int[] {left+1, right+1};
            } else if(sum < target){
                left++;
            } else{
                right--;
            }
        }
        return new int[] {-1, -1};
    }
    
