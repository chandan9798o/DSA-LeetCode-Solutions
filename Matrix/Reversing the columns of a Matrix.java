//Platform:GeeksForGeeks
//Approach:In this problem we use two pointer to reverse the column one by one of each row using while loop.
//Time Complexity:O(m*n)
//Space Complexity:O(1)

//Code-
class Solution {
    // Function to reverse the columns of a matrix.
    static void reverseCol(int matrix[][]) {
       int m = matrix.length;
       int n = matrix[0].length;
       for(int i=0; i<m; i++){
           int left = 0; int right = n-1;
           while(left<right){
               int temp = matrix[i][left];
               matrix[i][left] = matrix[i][right];
               matrix[i][right] = temp;
               left++;
               right--;
           }
       }
    }
}
