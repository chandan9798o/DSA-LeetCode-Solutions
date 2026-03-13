//Approach
Reduce the number to 1 by repeatedly dividing by 2 if even, otherwise increment or decrement the odd number strategically to reach a power of two faster, counting the minimum steps.
//Time Complexity:O(log n)
//Space Complexity:O(1)
//Code-
  class Solution {
    public int integerReplacement(int n) {
        int count = 0;
        long num = n;
        while(num!=1){
            if(num%2==0){
                num/=2;
            } else{
                if(num == 3 || num%4 == 1){
                    num--;
                }
                else{
                    num++;
                }
            }
            count++;
        }
        return count;
    }
}
