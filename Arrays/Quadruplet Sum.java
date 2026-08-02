//Platform:GeeksForGeeks
//Approach:Adding tow pair of sum and ensuring the target using HashMap.
//Time Complexity:O(n^2)
//Space Complexity:O(1)

//Code--
class Solution {
    public int countSum(int arr[], int target) {
        int count = 0;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j=1; j<n-1; j++){
            for(int k =j+1; k<n; k++){
                int currentSum = arr[j]+arr[k];
                int need = target - currentSum;
                count+=map.getOrDefault(need, 0);
            }
            for(int i=0; i<j; i++){
                int pairSum = arr[i]+arr[j];
                map.put(pairSum, map.getOrDefault(pairSum, 0)+1);
            }
        }
        return count;
    }
}
