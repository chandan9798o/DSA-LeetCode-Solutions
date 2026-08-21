//Platform:geeksForgeeks
//Approach: three array element added -> arraylist -> sorted using Collections -> return list
//Time Complexity:o(n+m+k log(n+m+k))
//Space Complexity:O(n+m+k)

//Code-
class Solution {
    public ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        // code here
        int len1 = a.length;
        int len2 = b.length;
        int len3 = c.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<len1; i++){
            list.add(a[i]);
        }
        for(int i=0; i<len2; i++){
            list.add(b[i]);
        }
        for(int i=0; i<len3; i++){
            list.add(c[i]);
        }
        Collections.sort(list);
        return list;
    }
}
