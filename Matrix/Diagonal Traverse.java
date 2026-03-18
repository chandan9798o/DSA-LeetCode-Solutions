//Platform:LeetCode
//Approach:Simulate diagonal movement with direction switch on boundaries.
//Time Complexity:O(m*n)
//Space Complexity:O(1)
//Code
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        
        int m = mat.length;         // rows
        int n = mat[0].length;      // columns
        int[] result = new int[m * n];
        int row = 0, col = 0;
        int direction = 1; // 1 means up-right, -1 means down-left
        int idx = 0;
        
        while (idx < m * n) {
            result[idx++] = mat[row][col];
            
            // Moving up-right
            if (direction == 1) {
                if (col == n - 1) {       // hit right boundary
                    row++;
                    direction = -1;
                } else if (row == 0) {    // hit top boundary
                    col++;
                    direction = -1;
                } else {
                    row--;
                    col++;
                }
            } 
            // Moving down-left
            else {
                if (row == m - 1) {       // hit bottom boundary
                    col++;
                    direction = 1;
                } else if (col == 0) {    // hit left boundary
                    row++;
                    direction = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }
        
        return result;
    }
}

