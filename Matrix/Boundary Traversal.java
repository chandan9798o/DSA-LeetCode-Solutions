//Platform:GeeksForGeeks
//Approach:In this traversal i simply traverse top row, left column and bottom row and left column if and only if row and column is given larger than one.
//Time Complexity:O(n)
//Space Complexity:O(n)

//Code--
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {

        ArrayList<Integer> list = new ArrayList<>();

        int m = mat.length;
        int n = mat[0].length;

        // Top row
        for (int i = 0; i < n; i++) {
            list.add(mat[0][i]);
        }

        // Right column
        for (int i = 1; i < m; i++) {
            list.add(mat[i][n - 1]);
        }

        // Bottom row (only if more than one row)
        if (m > 1) {
            for (int i = n - 2; i >= 0; i--) {
                list.add(mat[m - 1][i]);
            }
        }

        // Left column (only if more than one column)
        if (n > 1) {
            for (int i = m - 2; i >= 1; i--) {
                list.add(mat[i][0]);
            }
        }

        return list;
    }
}
