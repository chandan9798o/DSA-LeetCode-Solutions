//Platform:GeeksForGeeks
//Approach:First of all we sort the array and then use while toop by taking left and right initiate from the first and last element. In loop we store 
//the product at every step in sum variable and return as output.
//Time Complexity:O(n)
//Space Complexity:O(1)
//Code--
class Solution {
    public int altProduct(int[] arr) {
       Arrays.sort(arr);
       int sum = 0;
       int left = 0;
       int right = arr.length-1;
       while(left<right){
           sum+=arr[left] * arr[right];
           left++;
           right--;
       }
       return sum;
    }
}
