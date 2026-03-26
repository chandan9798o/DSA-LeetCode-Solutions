//Platform:GeeksForGeeks
//Approach:Prefix sum + HashMap is used to efficiently count subarrays with sum = k in O(n) time.
//Time Complexity:O(n)
//Space Complexity:O(n)
//code
import java.util.*;
class Solution {
    public static int subArraySum(int[] arr, int k) {
       int count = 0;
       int sum = 0;
       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0, 1);
       for(int n:arr){
           sum+=n;
           if(map.containsKey(sum-k)){
               count+=map.get(sum-k);
           }
           map.put(sum, map.getOrDefault(sum, 0)+1);
       }
       return count;
    }
}
