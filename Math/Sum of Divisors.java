//Platform:GeeksForGeeks
//Approach:Reverse Linear search and sum
//Time Complexity:O(n)
//Space Complexity:O(1)

//Code-

class Solution {
    static long divSum(long n) {
        long sum = 0;
        for(long i=n-1; i>=1; i--){
            if(n % i == 0){
                sum +=i;
            }
        }
        return sum;
        
    }
}
