//Problem:Median of two Sorted Arrays
//Platforms:LeetCode
//Approach:Binary Search Approach
//Time Complexity : O((n + m) log(n + m))
//Space Complexity :O(n + m)
//Code--
import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len3 = len1 + len2;

        int[] arr3 = new int[len3];
        int index = 0;

        for (int i = 0; i < len1; i++) {
            arr3[index++] = nums1[i];
        }
        for (int j = 0; j < len2; j++) {
            arr3[index++] = nums2[j];
        }

        Arrays.sort(arr3);

        if (len3 % 2 == 1) {
            // Odd length → middle element
            return arr3[len3 / 2];
        } else {
            int mid1 = arr3[len3 / 2 - 1];
            int mid2 = arr3[len3 / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}
