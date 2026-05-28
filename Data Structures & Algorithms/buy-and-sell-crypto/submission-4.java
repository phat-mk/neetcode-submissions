class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int left = 0;
        int right = 1;
        while(right < n) {
            int tempProfit = 0;
            if(prices[right] > prices[left]) {
                tempProfit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, tempProfit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}