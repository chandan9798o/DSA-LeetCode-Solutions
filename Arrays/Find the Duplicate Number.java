//Platform:LeetCode
//Approach:Simple search using HashSet to find duplicate
//Time complexity:O(n)
//Space Complexity:O(n)
//Code-
class solution{
  public int findDuplicate(int[] nums){
    HashSet<Integer> result = new HashSet<>();
    for(int num : nums){
      if(result.contains(num)){
        return num;
      } 
      result.add(num);
    }
    return -1;
  }
}
