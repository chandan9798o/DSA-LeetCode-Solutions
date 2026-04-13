//Plaftom:LeetCode
//Approach:Using HashMap to store all the frequency of array elements and then next iteration we store all elements which occured more than one times.
//and return its output.
//Space Complextiy:O(n)
//Time Complexity:O(n)
//Code--
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for(int n:map.keySet()){
            if(map.get(n) > 1){
                list.add(n);
            }
        }
        return list;
    }
}
