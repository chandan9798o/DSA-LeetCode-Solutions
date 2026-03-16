//Platform:LeetCode
//Approach:Traverse the array from right to left and add each digit to k, storing k % 10 in the result while updating k = k / 10 for carry. Reverse the list at the end since digits are added from least significant to most significant.
//Time Complexity: O(n)
//Space Complexity: O(n)
//Code:
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
