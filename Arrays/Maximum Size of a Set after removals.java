// Platform: LeetCode
// Approach:
// First, we calculate the limit as n/2 because we can keep only half of the elements from each array.
// Then, we use two HashSets to store the unique elements of both arrays separately.
// After that, we create a third HashSet called union to store all distinct elements from both sets using addAll().
// Finally, we return the minimum between:
// 1) total distinct elements available in both arrays
// 2) maximum distinct elements we can keep after removals
//
// Time Complexity: O(n)
// Space Complexity: O(n)
//Code--
class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int limit = n/2;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int m:nums1){
            set1.add(m);
        }
        for(int m:nums2){
            set2.add(m);
        }
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return Math.min(
            union.size(),
            Math.min(set1.size(), limit) + Math.min(set2.size(), limit)
        );
    }
}
