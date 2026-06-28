//Platform:LeetCode
//Approach:Here we use for loop to travers matrix at length of m+n-1 as the sum of row and column is constant and using while loop  we check the 
//Constant row and column sum and add to the list one by one by increasing row and decreaseing column.
//Time Complexity:o(n)
//Space Complexity:O(n)


//code
import java.util.*;

class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        ArrayList<Integer> list = new ArrayList<>();

        // Traverse all possible diagonals (i + j = constant)
        for (int d = 0; d < n + m - 1; d++) {
            
            int r = (d < m) ? 0 : d - m + 1;
            int c = (d < m) ? d : m - 1;

            while (r < n && c >= 0) {
                list.add(mat[r][c]);
                r++;
                c--;
            }
        }

        return list;
    }
}
