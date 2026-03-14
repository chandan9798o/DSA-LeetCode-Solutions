//Approach :Traverse the sorted array and use a two-pointer technique to place each new unique element at index k, effectively removing duplicates in-place.
//Time Complexity: O(n)
//Space Complexity: O(1)
//Code:
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
