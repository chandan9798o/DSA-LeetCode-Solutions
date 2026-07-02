//Platform:LeetCode
//Approach:In this problem first of all we make an array of sixe two to store the row and total number of one. And then we traverse the row and column of matrix to count the one.
//Outside the column loop we make count to reset counting process at every traverse level of new row and using condition statement we store the result in array
//and return it as output.
//Time Complexity:O(m*n)
//Space Compelxity:O(1)

//Code--
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
       int m = mat.length;
       int n = mat[0].length;
       int[] a = new int[2];
       int max = 0;
       for(int i=0; i<m; i++){
        int count = 0;
        for(int j=0; j<n; j++){
            if(mat[i][j] == 1){
                count++;
            }
            if(count > max){
                max = count;
                a[0] = i;
                a[1] = max;
            }
        }
       } 
       return a;
    }
}
