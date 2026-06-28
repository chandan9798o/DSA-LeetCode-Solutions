//Platform:GeeksForGeeks
//Approach:Here we make arraylist to store the sum of each row of given matrix. And then we convert the arrayList into arr as output. Here we use two for loop
//to calculate the row sum and keep sum variable outside of column loop for update the sum value at every new row.
//Time Complexity:O(n*m)
//Space Complexity:O(n)


//Code--
import java.util.*;
class Solution {
    public static int[] rowSum(int mat[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;
        for(int i=0; i<m; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum+=mat[i][j];
            }
            list.add(sum);
        }
        int[] arr = new int[list.size()];
        int i =0;
        for(int num:list){
            arr[i++] = num;
        }
        return arr;
        
    }
}
