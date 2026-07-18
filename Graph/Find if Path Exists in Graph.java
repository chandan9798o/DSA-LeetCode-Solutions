//Platform:LeetCode
//Approach:BFS Approach
//Time Compelxity:O(V+E)
//Space Complexity:O(V+E)

//Code-
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0 ; i<n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited = new boolean[n+1];
        q.offer(source);
        visited[source] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            if(node == destination){
                return true;
            }

            for(int neighbour : graph.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
        return false;

    }
}
