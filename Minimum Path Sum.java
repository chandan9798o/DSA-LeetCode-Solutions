//Platform:leetCode
//Approach:In this problem we use dynamic programming approach. First of all we make another empty string of given matrix size then we store the first
//top left element in another matrix to calculate minimum sum. And then we store first row sum and then first column sum. 
//After that we store remaining element sum using brute force approach and in last we return the left-bottom element as output which will be the minimum path sum.

//Time Complexity:O(m*n)
//Space Complexity:O(m*n)

//code-
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        //for first row 
        for(int j=1; j<n; j++){
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        //for first column
        for(int i=1; i<m; i++){
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        //for remain elements

    for(int i=1; i<m; i++){
        for(int j=1; j<n; j++){
            dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
        }
    }
    return dp[m-1][n-1];
        
    }
}
