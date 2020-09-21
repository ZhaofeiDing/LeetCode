package OfferTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/6 23:19
 */
public class Number14 {
    //贪心算法
//    public int cuttingRope(int n) {
//        if (n <= 3)
//            return n - 1;
//        int count = n / 3, r = n % 3;
//        if (r == 1) {
//            return (int) Math.pow(3, count - 1) * 4;
//        } else if (r == 2) {
//            return (int) Math.pow(3, count) * 2;
//        } else {
//            return (int) Math.pow(3, count);
//        }
//    }

    //动态规划
    public int cuttingRope(int n) {
        if (n == 2)
            return 1;
        int[] dp = new int[n + 1];
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}
