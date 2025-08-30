public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit); // Output: Maximum Profit: 5
    }
    // Function to calculate the maximum profit from stock prices
    // Time Complexity: O(n), where n is the number of prices
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        // Iterate through the prices to find the maximum profit
        for (int price : prices) {
            // Update the minimum price if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if we sell at the current price
            int profit = price - minPrice;
            // Update max profit if the current profit is greater
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
