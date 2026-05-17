class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuyPrice = prices[0];
        for (int price: prices) {
            if (price < minBuyPrice) {
                minBuyPrice = price;
            }
            int tempMaxProfit = price - minBuyPrice;
            if (tempMaxProfit > maxProfit) {
                maxProfit = tempMaxProfit;
            }
        }
        return maxProfit;
    }
}