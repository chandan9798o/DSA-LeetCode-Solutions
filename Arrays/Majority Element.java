//Platform : LeetCode
//Approach : Boyer–Moore Voting Algorithm
//Time Complexity : O(n)
//Space Complexity : O(1)
class solution{
  public int majorityElement(int[] nums){
    int count = 0;
    int candidate = 0;
    for(int n:nums){
      if(count == 0){
        candidate = n;
      }
      if(candidate == n){
        count++;
      } else{
        count--
          }
    }
    return candidate;
  }
}
