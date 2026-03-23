//Platform:LeetCode
//Approach:We use two hashMap to store the element of first array . And second HashSet is used to if the second array element contain to the first
//HashMap element then we return its output as intersections element.
//Time Complexity:O(n)
//Space Complexity:O(n)
//Code:
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        //Storing all the element of nums1 in set1
        for(int n:nums1){
            set1.add(n);
        }
        for(int n:nums2){
            if(set1.contains(n)){
                result.add(n);
            }
        }
        int[] arr = new int[result.size()];
        int i=0;
        for(int n:result){
           arr[i++] = n;
        }
        return arr;
    }
}
