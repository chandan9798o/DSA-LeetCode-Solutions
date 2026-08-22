//Platform:GeeksForGeeks
//Approach:Binary search approach
//Time Complexity:O(n)
//Space Complexity:O(1)

//code-
class Solution {
    int sumOfSeries(int n) {
        int sum = 0;
        while(n >= 1){
            int m = n * n * n;
            sum += m;
            n-=1;
        }
        return sum;
        
    }
}
