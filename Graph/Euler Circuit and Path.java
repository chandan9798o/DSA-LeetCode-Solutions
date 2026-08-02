//Platform:GeeksForGeeks
//Approach:Using Dfs
//Time Complexity:O(n)
//Space Complexity:O(1)

//code--
import java.util.*;

class Solution {

    void dfs(int node, boolean[] vis, int[][] adj) {
        vis[node] = true;

        for (int next : adj[node]) {
            if (!vis[next]) {
                dfs(next, vis, adj);
            }
        }
    }

    public int isEulerCircuit(int V, int[][] adj) {

        boolean[] vis = new boolean[V];

        int start = -1;

        for (int i = 0; i < V; i++) {
            if (adj[i].length > 0) {
                start = i;
                break;
            }
        }

        if (start == -1)
            return 2;

        dfs(start, vis, adj);
        for (int i = 0; i < V; i++) {
            if (adj[i].length > 0 && !vis[i]) {
                return 0;
            }
        }

        int odd = 0;

        for (int i = 0; i < V; i++) {
            if (adj[i].length % 2 != 0)
                odd++;
        }

        if (odd == 0)
            return 2;

        if (odd == 2)
            return 1;

        return 0;
    }
}
