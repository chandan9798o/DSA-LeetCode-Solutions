//Platform:LeetCode
//Approach:Simple swaping method used to trasnpose the matrix
//Time Complexity:O(m*n)
//Space Complexity:O(1)
//Code-
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [][] temp = new int[n][m];
        for(int j = 0; j<n; j++){
            for(int i = 0; i<m; i++){
                temp[j][i] = matrix[i][j];
                
            }
        }
        return temp;
    }
}
