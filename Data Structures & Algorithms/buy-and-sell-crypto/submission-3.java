class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int tempProfit = 0;
                if(prices[j] > prices[i]) {
                    tempProfit = prices[j] - prices[i];
                }
                maxProfit = Math.max(maxProfit, tempProfit);
            }
        }
        return maxProfit;
    }
}