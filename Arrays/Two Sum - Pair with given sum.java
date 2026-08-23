//Platform:GeeksForGeeks
//Approach:Hashing using Hashset
//Time Complexity:O(n)
//Space Complexity:O(1)

//Code--
class Solution {
    boolean twoSum(int arr[], int target) {
       HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            int need = target - arr[i];
            if(set.contains(need)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
        
    }
}
