//Platfom:GeeksForGeeks
//Approach: For this problem i made a array of given size to store the nth fibonnci elements. And using for loop we update a and b to make series.
//Time Complexity:O(n)
//Space Complexity:O(n)

//Code---
class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        int[] arr = new int[n];
        int a = 0;
        int b = 1;
        for(int i= 0; i<n; i++){
            arr[i] = a;
            int c = a+b;
            a = b;
            b = c;
        }
        return arr;
    }
}
