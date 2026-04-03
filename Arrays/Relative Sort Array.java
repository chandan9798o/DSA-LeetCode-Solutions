//Platform: LeetCode
//Approach:
// 1. Use HashMap to store frequency of each element from arr1.
// 2. Traverse arr2 and place its elements first in the same relative order.
// 3. Remove used elements from map so only leftover elements remain.
// 4. Collect remaining elements, sort them in ascending order,
//    and place them at the end of arr1.
//Time Complexity: O(n + k log k)
//Space Complexity: O(n)
//Code:

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency count of arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        // Place arr2 elements first
        for (int num : arr2) {
            int count = map.get(num);

            while (count > 0) {
                arr1[index++] = num;
                count--;
            }

            map.remove(num);
        }

        // Collect remaining elements
        List<Integer> remaining = new ArrayList<>();

        for (int key : map.keySet()) {
            int count = map.get(key);

            while (count > 0) {
                remaining.add(key);
                count--;
            }
        }

        // Sort remaining elements
        Collections.sort(remaining);

        // Place remaining elements
        for (int num : remaining) {
            arr1[index++] = num;
        }

        return arr1;
    }
}
