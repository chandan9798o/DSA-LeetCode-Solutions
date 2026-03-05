//Platform:LeetCode
//Approach:Hashing Technique
//Time Complexity:O(n)
//Space Complexity:O(n)
//Code--
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        HashSet<Integer> result = new HashSet<>();
        for(int i=0; i<len; i++){
           if(result.contains(nums[i])){
            return true;
           }
           result.add(nums[i]);
        }
        return false;
    }
}
