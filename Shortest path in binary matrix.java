//Platform:leetCode
//Approach:Check if the starting cell (0,0) or ending cell (n-1,n-1) is blocked (1). If yes, return -1.
//Create a Queue and insert the starting cell (0,0) with distance 1.
//Mark (0,0) as visited.
//While the queue is not empty:
//Remove the front cell.
//If it is the destination, return its distance.
//Explore all 8 directions (up, down, left, right, and the 4 diagonals).
//For every valid unvisited cell having value 0, mark it visited and push it into the queue with distance + 1.
//If the destination is never reached, return -1.

//Time Complexity:O(n^2)
//Space Complexity:O(n^2)

//Code--
import java.util.*;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        int n = grid.length;

        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;

        int[][] direct = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1},           {0, 1},
                {1, -1},  {1, 0},  {1, 1}
        };

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0, 0, 1});

        grid[0][0] = 1;

        while (!queue.isEmpty()) {

            int[] curr = queue.poll();

            int row = curr[0];
            int col = curr[1];
            int dist = curr[2];

            if (row == n - 1 && col == n - 1)
                return dist;

            for (int[] dr : direct) {

                int newRow = row + dr[0];
                int newCol = col + dr[1];

                if (newRow >= 0 && newRow < n &&
                    newCol >= 0 && newCol < n &&
                    grid[newRow][newCol] == 0) {

                    grid[newRow][newCol] = 1;

                    queue.offer(new int[]{newRow, newCol, dist + 1});
                }
            }
        }

        return -1;
    }
}
