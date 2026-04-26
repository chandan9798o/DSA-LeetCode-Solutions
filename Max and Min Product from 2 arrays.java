//Platform:GeeksForGeeks
//Approach:First of all Sort the both arrays and make a long variable pro and store into the product of last element of first array and first element of
//second array as maximum and minimum. And in last returning its output.
//Time Complexity:O(n)
//Space Compelxity:O(1)
//Code--

class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
       long pro = 1;
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       pro = arr1[arr1.length-1] * arr2[0];
       return pro;
        
    }
}
