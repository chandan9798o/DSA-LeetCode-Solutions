//Platform:LeetCode
//Approach:Use the reverse algorithm: reverse the entire array, then reverse the first k elements, and finally reverse the remaining n−k elements
//to achieve the rotation.
//Time Complexity: O(n)
//Space Complexity: O(1)
//Code-
class Solution {

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    void reverse(int[] arr, int start, int end){

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
