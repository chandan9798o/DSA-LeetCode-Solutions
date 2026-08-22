//Platform:GeeksForGeeks
//Approach:Two pointer
//Time Complexity:O(n)
//Space Complexity:O(1)
//Code--
class Solution {
    public void rotateArr(int arr[], int d) {
       int n = arr.length;
       d = d%n;
       int left = 0;
       int right = n-1;
       rotate(arr, 0, n-1);
       rotate(arr, 0, n-d-1);
       rotate(arr, n-d, n-1);
       
    }
    
    public void rotate(int[] arr, int left, int right){
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
