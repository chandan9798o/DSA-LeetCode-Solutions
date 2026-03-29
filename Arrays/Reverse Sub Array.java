//Platform:GeeksForGeeks
//Approach:Using two pointer left equal to given range minue 1 and right similary minus one. In while loop we swap it traditioanlly. and give output.
//Time Complexity:O(n);
//Space Complexity:O(n)
//Code--
lass Solution {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,
                                                     int r) {
        ArrayList<Integer> set = new ArrayList<>();
        
        int[] a = new int[arr.size()];
        int i=0;
        for(int n:arr){
            a[i++] = n;
        }
        int left = l-1; 
        int right = r-1;
        while(left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        for(int n:a){
            set.add(n);
        }
        return set;
        
    }
}
