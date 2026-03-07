// Platform: LeetCode
// Approach: Transpose the matrix and then reverse each row to rotate 90° clockwise
// Time Complexity: O(n^2)
// Space Complexity: O(1)
//Code-
class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i<rows; i++){
            for(int j=i; j<col; j++ ){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i<rows; i++){
            int left = 0;
            int right = col -1;
            while (left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left ++;
                right--;
            }
        }
    }
}
