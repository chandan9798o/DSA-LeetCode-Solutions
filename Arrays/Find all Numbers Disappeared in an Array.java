//Plaftrm:LeetCode
//Approach:Sort the array and use two pointers to compare expected numbers (1 to n) with actual elements, adding missing values to the result list.
//Time Complexity:O(n logn)
//Space Complexity:O(n)
//Code--
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();

        int j = 0;
        for(int i = 1; i <= nums.length; i++){

            while(j < nums.length && nums[j] < i){
                j++; // skip duplicates / smaller values
            }

            if(j < nums.length && nums[j] == i){
                j++;
            } else {
                result.add(i);
            }
        }
        return result;
    }
}
