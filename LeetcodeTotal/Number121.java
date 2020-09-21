package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/20 16:33
 */
public class Number121 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, profit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i] - minPrice);
        }
        return profit;
    }
}
