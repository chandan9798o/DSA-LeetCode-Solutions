//Platform:GeeksForGeeks
//Approach:Brute Force
//Time Complexity:O(m * n)
//Space Complexity:O(k)

//Code--
class Solution {
    public static int[] colSum(int mat[][]) {
       ArrayList<Integer> list = new ArrayList<>();
       for(int j=0; j<mat[0].length; j++){
           int sum = 0;
           for(int i = 0; i<mat.length; i++){
               sum+=mat[i][j];
           }
           list.add(sum);
       }
       int[] arr = new int[list.size()];
       int k = 0;
       for(int nu : list){
           arr[k++] = nu;
       }
       return arr;
    }
}
