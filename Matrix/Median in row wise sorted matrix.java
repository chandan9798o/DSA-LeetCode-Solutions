//Platform:GeeksForGeeks
//Approach:In this problem we make a arraylist to store all the matrix element and then make a arr to convert the arrlist into array to sort and find the median of 
//Array using formula num = arr[arr.length/2]. And return median as output.
//Time Compelxity:O(n * m)
//Space Complexity:O(n)


//Code--
class Solution {
    public int median(int[][] mat) {
       ArrayList<Integer> list = new ArrayList<>();
       int m = mat.length;
       int n = mat[0].length;
       for(int i=0; i<m; i++){
           for(int j=0; j<n; j++){
               list.add(mat[i][j]);
           }
       }
       int[] arr = new int[list.size()];
       int i =0;
       for(int ch:list){
           arr[i++] = ch;
       }
       Arrays.sort(arr);
       int num = arr[arr.length / 2];
       return num;
       
    }
}
