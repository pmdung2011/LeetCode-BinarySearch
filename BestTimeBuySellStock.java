//Leetcode
public class BestTimeBuySellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }

    public static int solve(int[] prices){
        if(prices == null) return 0;
        int bought = prices[0]; //Assume we bought the stock in the first day
        int maxProfit = 0;

        //Start from the second day
        for(int i = 1; i < prices.length; i++){
            //if the price in the next day is higher than we have bought
            //Then consider selling on that day to get the profit
            if(prices[i] > bought){
                maxProfit = Math.max(prices[i] - bought, maxProfit);
            }
            //If the price in the next day is lower than we have bought
            //Consider buy the stock on that day
            else{
                bought = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stocks = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(stocks));
        System.out.println(solve(stocks));
    }
}
