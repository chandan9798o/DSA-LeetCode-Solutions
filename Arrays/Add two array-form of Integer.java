//Platform:LeetCode
//Approach:Traverse the array from the end, add each digit with k, 
//store the last digit in the result list, update the carry in k, and finally reverse the list.
//Time Complexity: O(n)
//Space Complexity: O(n)
//Code-
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length-1;
        List<Integer> result = new ArrayList<>();
        while(i>=0 || k>0){
            if(i >=0){
               k = k + num[i];
               i--;
            }
            result.add(k%10);
            k/=10;
        }
        Collections.reverse(result);
        return result;  
    }
}
