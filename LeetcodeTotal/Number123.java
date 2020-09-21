package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/21 16:19
 */
public class Number123 {
    public int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }
        int n = prices.length, max_k = 2;
        int[][][] dp = new int[n][max_k+1][2];
        for (int i = 0; i < n; i++) {
            for (int k = max_k; k > 0; k--) {
                if (i - 1 < 0) {
                    dp[i][k][0] = 0;
                    dp[i][k][1] = -prices[i];
                    continue;
                }
                dp[i][k][0] = Math.max(dp[i - 1][k][0], dp[i - 1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i - 1][k][1], dp[i - 1][k - 1][0] - prices[i]);
            }
        }
        return dp[n-1][max_k][0];
    }
}
