//Platform:LeetCode
//Approach:Firsty we sort the arrays using Arrays.sort() method. After that we return the value of element with given k-1.
//Time Compelxity:O(n)
//Space Complexity:O(1)
//Code-
class Solution {
    public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
