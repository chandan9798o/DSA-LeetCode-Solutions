//Approach:
// Use binary search on the value range.
// For every mid, count how many elements are <= mid
// using bottom-left traversal in O(n).
// If count < k, search right side else search left.

//Time Complexity: O(n * log(max-min))
//Space Complexity: O(1)
//code--
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLess(matrix, mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private int countLess(int[][] matrix, int mid) {
        int n = matrix.length;
        int row = n - 1;
        int col = 0;
        int count = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= mid) {
                count += row + 1;
                col++;
            } else {
                row--;
            }
        }
        return count;
    }
}
