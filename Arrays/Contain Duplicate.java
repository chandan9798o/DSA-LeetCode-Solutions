// Platform: LeetCode
// Approach:
// We use a HashSet to maintain a sliding window of size k.
// For each element, we check if it already exists in the set.
// If it exists, it means we found a duplicate within k distance, so return true.
// Otherwise, we add the current element to the set.
// If the size of the set becomes greater than k, we remove the element 
// that is k indices behind (nums[i - k]) to maintain the window size.

// Time Complexity: O(n)
// Space Complexity: O(k)
import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            
            if(set.contains(nums[i])){
                return true;
            }

            set.add(nums[i]);

            if(set.size() > k){
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
