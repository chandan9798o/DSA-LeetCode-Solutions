//Platform:LeetCode
//Approach:Traverse the array, track the minimum price so far using Math.min, and calculate the maximum profit using Math.max by comparing prices[i] - minPrice. Return the maximum profit.
//Time Complexity: O(n)
//Space Complexity: O(1)
//Code--class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit , prices[i] - minPrice);
        }
        return profit;
    }
}
