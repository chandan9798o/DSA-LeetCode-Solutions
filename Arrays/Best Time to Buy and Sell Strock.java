// Platform: LeetCode
// Approach: Traverse the array and whenever the current price is greater than the previous  price,
// add the difference to profit to accumulate all possible gains.
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }

        return profit;
    }
}
