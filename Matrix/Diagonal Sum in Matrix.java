//Platform:GeeksForGeeks
//Approach:In this problem we first traverse the left to right diagonal using two for loop with condition if row and column value same. And the right to left digonal with 
//method with formula mat[n-i-1] where n represent the number of column. After that we calculate sum of these both diagonal and return as total as output.
//Time Complexity:O(m*n)
//Space Complexity:O(1)

//Code-


class Solution {
    public int diagonalSum(int[][] mat) {
       int sum1 = 0;
       int sum2 = 0;
       int m = mat.length;
       int n = mat[0].length;
       for(int i=0; i<m; i++){
           for(int j=0; j<n; j++){
               if(i == j){
                   sum1+=mat[i][j];
               }
           }
       }
       for(int i=0; i<m; i++){
           sum2+=mat[i][n-1-i];
       }
       return sum1+sum2;
        
    }
}
