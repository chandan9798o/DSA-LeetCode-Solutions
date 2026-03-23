//Platform:LeetCode

//Approach:Use a HashMap to store frequency of each element.
//Traverse the map and check elements with frequency = 1.
//Add those elements to the sum.

//Time Complexity:O(n)
//Space Compexity:O(n)

//Code--
class Solution {
    public int sumOfUnique(int[] nums) {
       Map<Integer, Integer> freq = new HashMap<>();
       List<Integer> result = new ArrayList<>();
       int sum=0;
       for(int n:nums){
        freq.put(n, freq.getOrDefault(n, 0)+1);
       }
       for(int n:nums){
        if(freq.get(n) == 1){
            result.add(n);
        } 
       }
       for(int n:result){
        sum+=n;
       }
       return sum;
       

    }
}
