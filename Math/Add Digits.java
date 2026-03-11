//Platform:LeetCode
//Appraoch:If num < 10, return num. Otherwise, calculate the sum of its digits using a while loop and recursively call the function with the new sum until the result becomes a single digit.
//Time Complexity  : O(log n)
//Space Complexity : O(log n)  (due to recursion stack)
//Code-
class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum+=digit;
            num/=10;
        }
        return addDigits(sum);
    }
}
