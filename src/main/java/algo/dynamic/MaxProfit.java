package algo.dynamic;

public class MaxProfit {
  public static int solution(int[] prices) {
    int profit = 0;
    boolean holding = false;
    int buyPrice = 0;
    int sellPrice;

    prices = appendZero(prices);

    for (int i = 0; i < prices.length - 1; i++) {
      if (prices[i] <= prices[i + 1] && !holding) {
        // If next day's price is equal or bigger than today's price and you didn't hold
        // the stock. Buy it today
        buyPrice = prices[i];
        holding = true;
      }
      if (prices[i] > prices[i + 1] && holding) {
        // If today's price is bigger than next day's price and you hold the stock. Sell
        // it today.
        sellPrice = prices[i];
        holding = false;
        profit += sellPrice - buyPrice;
        buyPrice = 0;
      }
    }

    return profit;
  }

  // Add 0 to the end of an array
  private static int[] appendZero(int[] arr) {
    int[] result = new int[arr.length + 1];
    for (int i = 0; i < arr.length; i++) {
      result[i] = arr[i];
    }
    result[result.length - 1] = 0;
    return result;
  }
}