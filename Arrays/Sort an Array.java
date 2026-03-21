//Platform:LeetCode
//Approach:Merge Sort
//Time Complexity:O(n)
//Space Complexity:O(1)
//Code--
class Solution {
    public int[] sortArray(int[] nums) {

        // Step 1: Call merge sort on full array
        mergeSort(nums, 0, nums.length - 1);

        return nums;
    }

    // Step 2: Divide array into two halves
    void mergeSort(int[] nums, int left, int right) {

        // Base case: if only one element
        if (left >= right) {
            return;
        }

        // Find mid
        int mid = left + (right - left) / 2;

        // Recursively sort left half
        mergeSort(nums, left, mid);

        // Recursively sort right half
        mergeSort(nums, mid + 1, right);

        // Step 3: Merge both sorted halves
        merge(nums, left, mid, right);
    }

    // Step 4: Merge two sorted arrays
    void merge(int[] nums, int left, int mid, int right) {

        // Create temporary arrays
        int[] temp = new int[right - left + 1];

        int i = left;      // pointer for left half
        int j = mid + 1;   // pointer for right half
        int k = 0;         // pointer for temp array

        // Compare and fill temp array
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining elements of left half
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Copy remaining elements of right half
        while (j <= right) {
            temp[k++] = nums[j++];
        }

        // Copy temp back to original array
        for (int p = 0; p < temp.length; p++) {
            nums[left + p] = temp[p];
        }
    }
}
