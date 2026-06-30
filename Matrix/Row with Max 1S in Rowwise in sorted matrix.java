//Platfrom:GeeksForGeeks
//Approach:In this problem we traverse the matrix row and column element using for loop. In the outer layer of loop means row we assemble a count variable to update  on each 
//new row to count 1s in matrix. And we check the number of count is maximum from previous result . If is it then we return its row as output.
//Time Compelxity:O(m * n)
//Space Complexity:O(1)

//Code-
class Solution {
    public int rowWithMax1s(int[][] arr) {
       int m = arr.length;
       int n = arr[0].length;
       int valu = -1;
       int maxOne = 0;
       for(int i=0; i<m; i++){
           int count = 0;
           for(int j=0; j<n; j++){
               if(arr[i][j] == 1){
                   count++;
                   if(count > maxOne){
                       maxOne = count;
                       valu = i;
                   }
               }
           }
       }
       return valu;
    }
};
