//Platform:LeetCode
//Approach:First of all we make two variables sum and maxSum and store zero.
//Then we traverse the array till the size of given value k.
//and add the elements of the arrays.
//After that we again traverse the arrays from size k to last elements and add size k elements to subtracting the previous one elements.
//and using math.max we are returning the desired output.
//Time Complexity:O(n)
//Space Compelxity:O(1)
//Code--
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public static void main(String[] args){
         int[] arr = {1, 4, 2, 10, 2, 3, 1};
         int k = 4;
         int sum = 0;
         int maxSum = 0;
         for(int i=0; i<k; i++){
            sum+=arr[i];
            maxSum = sum;
         }
         for(int i=k; i<arr.length; i++){
            sum+=arr[i]-arr[i-k];
            maxSum = Math.max(maxSum, sum);
         }
         System.out.println(maxSum);
         
        }   
    }

    
