package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/21 18:32
 */
public class Number309 {
    //    public int maxProfit(int[] prices) {
//        int n = prices.length;
//        if (n < 2) {
//            return 0;
//        }
//        int dp_i_0 = 0, dp_i_1 = Integer.MIN_VALUE;
//        int pre = 0;
//        for (int i = 0; i < n; i++) {
//            int temp = dp_i_0;
//            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
//            dp_i_1 = Math.max(dp_i_1, pre - prices[i]);
//            pre = temp;
//        }
//        return dp_i_0;
//    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n < 2) {
            return 0;
        }
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (i - 2 < 0) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
                continue;
            }
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 2][0] - prices[i]);
        }
        return dp[n - 1][0];
    }
}
