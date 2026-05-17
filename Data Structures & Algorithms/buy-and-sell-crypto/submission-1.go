func maxProfit(prices []int) int {
    min_price, max_profit := prices[0], 0
    for _,price := range prices {
        if price < min_price {
            min_price = price
        }
        temp_max_profit := price - min_price
        if (temp_max_profit > max_profit) {
            max_profit = temp_max_profit
        }
    }
    return max_profit
}
