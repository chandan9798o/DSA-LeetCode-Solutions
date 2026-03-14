// Platform: LeetCode
// Approach:
// 1. First sort the array.
// 2. Fix the first two elements using two loops (i and j).
// 3. Use two pointers (left and right) to find the remaining two numbers.
// 4. Skip duplicate elements to avoid repeated quadruplets.
// 5. Compare the sum with target and store valid combinations.

// Time Complexity: O(n^3)
// Two nested loops + one two-pointer traversal.

// Space Complexity: O(1)
// No extra space used except the output list.

//Code--
import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n - 3; i++){

            if(i > 0 && nums[i] == nums[i-1]) continue;

            for(int j = i + 1; j < n - 2; j++){

                if(j > i + 1 && nums[j] == nums[j-1]) continue;

                int left = j + 1;
                int right = n - 1;

                while(left < right){

                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == target){

                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        left++;
                        right--;

                        while(left < right && nums[left] == nums[left-1]) left++;
                        while(left < right && nums[right] == nums[right+1]) right--;
                    }

                    else if(sum < target){
                        left++;
                    }

                    else{
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
