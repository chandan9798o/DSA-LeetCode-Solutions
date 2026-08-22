//Platform:GfG
//Approach:Adding first and second array element -> HashSet1  and HashSet2 -> again adding to arraylist and sort it and return it.
//Time Complexity:O(m+n log(m+n))
//Space Complexity:O(m+n)
//Code--
import java.util.HashSet;
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
       HashSet<Integer> set1 = new HashSet<>();
       HashSet<Integer> set2 = new HashSet<>();
       ArrayList<Integer> list = new ArrayList<>();
       for(int n :a){
          set1.add(n);
       }
       for(int n :b){
          set2.add(n);
       }
       set1.addAll(set2);
       for(int m : set1){
           list.add(m);
       }
       Collections.sort(list);
       return list;
    }
}
