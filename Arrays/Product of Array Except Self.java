//Platform:LeetCode
//Approch:Use prefix product and suffix product to calculate the product of array elements except the current index in O(n) time.
//Time Complexity:O(n)
//Space Complexity:O(1)
//Code--
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        //for left
        result[0] = 1;
        for(int i=1; i<len; i++){
            result[i] = result[i-1] * nums[i-1];
        }
        //for right
        int right = 1;
        for(int i=len-1; i>=0; i--){
            result[i] = result[i] * right;
            right = right * nums[i];
        }
        return result;
    }
}
