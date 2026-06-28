//Platform:GeeksForGeeks
//Approach:We just change the rows using for loop and two pointer to swap the elements of a particular position one by one.
//Time Complexity:O(n*m)
//Space Complexity:O(1)

//Code--
import java.util.ArrayList;
class Solution {
    static void interchangeRows(int matrix[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0 ; i<m/2; i++){
            for(int j=0; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[m-1-i][j];
                matrix[m-1-i][j] = temp;
            }
        }
         
    }
}
