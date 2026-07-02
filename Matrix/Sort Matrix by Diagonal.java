//Platform:LeetCode
//Approach
//Traverse all diagonals starting from the first column (including the main diagonal).
//Store the elements of each diagonal in a list.
//Sort the list in descending order and place the elements back into the same diagonal.
//Then traverse the remaining diagonals starting from the first row (excluding the main diagonal).
//Store the elements of each diagonal in a list.
//Sort the list in ascending order and place the elements back into the same diagonal.
//Return the modified matrix.

//Time Complexity: O(n² log n)
//Space Complexity: O(n)

//Code-
import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {

        int n = grid.length;

        
        for (int row = 0; row < n; row++) {

            ArrayList<Integer> list = new ArrayList<>();

            int i = row;
            int j = 0;

            while (i < n && j < n) {
                list.add(grid[i][j]);
                i++;
                j++;
            }

            Collections.sort(list, Collections.reverseOrder());

            i = row;
            j = 0;
            int k = 0;

            while (i < n && j < n) {
                grid[i][j] = list.get(k++);
                i++;
                j++;
            }
        }

        // Top-right diagonals
        for (int col = 1; col < n; col++) {

            ArrayList<Integer> list = new ArrayList<>();

            int i = 0;
            int j = col;

            while (i < n && j < n) {
                list.add(grid[i][j]);
                i++;
                j++;
            }

            Collections.sort(list);

            i = 0;
            j = col;
            int k = 0;

            while (i < n && j < n) {
                grid[i][j] = list.get(k++);
                i++;
                j++;
            }
        }

        return grid;
    }
}
