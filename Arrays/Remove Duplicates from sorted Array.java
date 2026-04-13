// Platform: LeetCode
// Approach:
// Since the array is sorted, we can allow at most two occurrences of each element.
// First, if the array length is less than or equal to 2, we directly return its length
// because no extra duplicates need to be removed.
//
// We initialize k = 2 because the first two elements are always allowed.
// Then, we traverse the array from index 2.
// For each element, we compare it with nums[k - 2].
// If they are different, it means the current element has appeared less than two times,
// so we place it at index k and increment k.
//
// Finally, k represents the length of the modified array.
//
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int k = 2;
        for(int i=2; i<nums.length; i++){
            if(nums[i] != nums[k-2]){
              nums[k] = nums[i];
              k++;
            }
        }
        return k;
    }
}
