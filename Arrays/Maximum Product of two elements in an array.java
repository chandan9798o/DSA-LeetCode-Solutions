//Platform:LeetCode
//Approach:Firstly we decrese 1 form each and every element of the array and then sort by using Arrays.sort() method. 
//After that we multiply last two element and return its maximum product as output.
//Time Complexity:O(n)
//Space Complexity:O(n)
//Code-
class Solution {
    public int maxProduct(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] -=1;
        }
        Arrays.sort(nums);
        int product = nums[nums.length-1]*nums[nums.length-2];
        return product;

    }
}
