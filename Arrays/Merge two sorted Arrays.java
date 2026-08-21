//Platform:GeeksForGeeks
//Approach:a + b → single array → Arrays.sort() → return
//Time Complexity:O(m+n log(m+n))
//Space Complexity:O(m+n)

//Code
class Solution {
    public int[] sortedMerge(int[] a, int[] b) {
        int len1 = a.length;
        int len2 = b.length;
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0; i<len1; i++){
           list.add(a[i]);
       }
       for(int i=0; i<len2; i++){
           list.add(b[i]);
       }
       int[] arr = new int[len1+len2];
       int j = 0;
       for(int n:list){
           arr[j++] = n;
       }
       Arrays.sort(arr);
       return arr;
    }
}
