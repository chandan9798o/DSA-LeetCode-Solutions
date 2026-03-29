//Platform:GeeksforGeeks
//Approach:We traverse the array in steps of k and reverse each segment in-place, so overall time is linear O(n) and no extra space is used, hence O(1).”
//Time Complexity:O(n)
//Space Complexity:O(1)
//Code--
    public void reverseInGroups(int[] arr, int k) {
       
       int n = arr.length;
       for(int i=0; i<n; i+=k){
           int left = i;
           int right = Math.min(i+k-1, n-1);
           reversev(arr, left, right);
       }
    }
    private  void reversev(int[] arr, int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
           }
       }
}
