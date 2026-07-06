class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;  // Our buying day pointer
        int sell = 1; // Our selling day pointer
        int maxProfit = 0;

        // Keep sliding the selling window until we reach the end of the array
        while (sell < prices.length) {
            // If it's a profitable transaction
            if (prices[buy] < prices[sell]) {
                int profit = prices[sell] - prices[buy];
                
                // Keep track of the highest profit seen so far
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } 
            // If the price dropped below our buying price, change our buying day!
            else {
                buy = sell;
            }
            
            // Always look at the next selling day
            sell++;
        }

        return maxProfit;
    }
}