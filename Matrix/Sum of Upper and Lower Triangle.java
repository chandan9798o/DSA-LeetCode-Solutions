//Platform:GeeksForGeeks
//Approach:Linear Search of row and column using Brute Force.
//Time Complexity: O(n*n)
//Space Complexity:O(n)
//Code---
class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        int upp_tri = 0;
        int low_tri = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(i <= j){
                    upp_tri+=mat[i][j];
                }
                if(i >= j){
                    low_tri += mat[i][j];
                }
            }
        }
        list.add(upp_tri);
        list.add(low_tri);
        return list;
        
    }
}
