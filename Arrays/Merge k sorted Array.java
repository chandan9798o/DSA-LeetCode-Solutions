//Platform:GeeksForGeeks
//Approach:Brute Force 
//Time Complexity:O(n logn)
//Space Complexity:O(n)

//code--
class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
       int m = mat.length;
       int n = mat[0].length;
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0; i<m; i++){
           for(int j=0; j<n; j++){
              list.add(mat[i][j]);
           }
       }
       Collections.sort(list);
       return list;
        
    }
}
