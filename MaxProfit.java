//

//Best Time to Buy and Sell Stock II
class MaxProfit {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        // We get the profit when the point on the right is higher than the point on the
        // left.
        // We start the loop at 1 because we have to compare to the left value, which is
        // the first one.
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] stocks = { 7, 1, 5, 3, 6, 4 };
        System.out.println("The profit is: " + maxProfit(stocks));
    }
}