//Platform:GeeksForGeeks
//Approach:First of all we convert list to array for traversing and then we check
//the current element is less than next element or not. If yes then count incresing 
//if not count becomes zero. After that we find maximum length subarray by using math max method.
//and return it as output.
//Time Complexity:O(n)
//Space Complexity:O(1)
//code--
class Solution {
    public int lenOfLongIncSubArr(List<Integer> arr) {
       int count = 0;
       int maxLen = 0;
       Integer[] nums = arr.toArray(new Integer[0]);
       for(int i=0; i<nums.length-1; i++){
           if(nums[i] < nums[i+1]){
               count++;
               maxLen = Math.max(count, maxLen);
           } else{
               count = 0;
           }
       }
       return maxLen+1;
    }
}
