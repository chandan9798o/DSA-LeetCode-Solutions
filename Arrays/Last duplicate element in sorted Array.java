//Platform:GeeksForGeeks
//Approach:First of all we make new array of size two which store duplicate element index and its value. Then we traverse the array from right to left and 
//and check is there any duplicate elements. If found we store its index and its value also and return as it output.
//Time Complexity:O(n)
//Space Complexity:O(1)
//Code--
// User function Template for Java

class Solution {
    public int[] dupLastIndex(int[] arr) {
        int[] a = {-1, -1};
        for(int i = arr.length-1; i>=1; i--){
            if(arr[i] == arr[i-1]){
                a[0] = i;
                a[1] = arr[i];
                break;
            }
        }
        return a;
    }
}
