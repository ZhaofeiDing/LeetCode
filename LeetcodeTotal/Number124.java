package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/21 18:08
 */
public class Number124 {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n < 2) {
            return 0;
        }
        //买卖算一次交易，交易次数大于等于数组长度的一半，退化为k不限制的情况
        if (k >= n / 2) {
            int profit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1])
                    profit += prices[i] - prices[i - 1];
            }
            return profit;
        }

        /***
         *    n:交易的天数
         *    k:已经完成的交易次数
         *    0:不持有股票，1：持有股票
         */
        int[][][] dp = new int[n][k + 1][2];
        for (int i = 0; i < n; i++) {
            for (int j = k; j > 0; j--) {
                if (i - 1 < 0) {
                    dp[i][j][0] = 0;
                    dp[i][j][1] = -prices[i];
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }
        return dp[n - 1][k][0];
    }
}
