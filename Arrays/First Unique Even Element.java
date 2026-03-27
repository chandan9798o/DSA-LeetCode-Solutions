//Platform:LeetCode
//Approach:First, we store the frequency of each element using a HashMap.
// Then, we traverse the original array to maintain order.
// For each element, we check two conditions:
// 1. It should be even (n % 2 == 0)
// 2. Its frequency should be exactly 1
// The first element satisfying both conditions is returned.
// If no such element exists, we return -1.
//Time Complexity:O(n)
//Space Complexity:O(n)
//Code:
import java.util.*;
class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequency
        for(int n : nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        // Step 2: Traverse original array (maintain order)
        for(int n : nums){
            if(n % 2 == 0 && freq.get(n) == 1){
                return n;
            }
        }

        return -1;
    }
}
