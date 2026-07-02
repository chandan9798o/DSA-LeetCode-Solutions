//Platform:LeetCode
//Approach:In this problem first of all we store the left to right and right to left diagonal in arrayList. And then we check largest prime number using
//for each loop and return it as output.
//Time Complexity:O(m * n)
//Space Complexity:O(n)

//Code--
class Solution {
    public int diagonalPrime(int[][] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int value = 0;
        int m = nums.length;
        int n = nums[0].length;
        for(int i=0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i == j){
                  list.add(nums[i][j]);
                }
            }
        }
        for(int i=0; i<m; i++){
            list.add(nums[i][n-1-i]);
        }
        for(int a : list){
            if(isPrime(a) && a > value){
                value = a;
            }
        }
        return value;

    }
    static boolean isPrime(int n){
            if(n <= 1) {
                return false;
            }
            for(int i=2; i*i <= n; i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    
}
