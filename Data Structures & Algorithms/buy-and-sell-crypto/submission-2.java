class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuyPrice = prices[0];
        for (int price: prices) {
            if (price < minBuyPrice) {
                minBuyPrice = price;
            }
            maxProfit = Math.max(maxProfit, price - minBuyPrice);
        }
        return maxProfit;
    }
}