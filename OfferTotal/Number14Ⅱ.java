package OfferTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/8 23:03
 */
public class Number14Ⅱ {
    public int cuttingRope(int n) {
        //动态规划做不了，只能用贪心算法实现
//        int div = 1000000007;
//        int[] dp = new int[n + 1];
//        dp[2] = 1;
//        for (int i = 3; i <= n; i++) {
//            for (int j = 1; j < i; j++) {
//                dp[i] = Math.max(dp[i], dp[i - j] * j)%div;
//            }
//        }
//        return dp[n] % div;

        //贪心算法实现
        if (n <= 3)
            return n - 1;
        int div = 1000000007;
        long res = 1;
        while (n > 4) {
            res = (res * 3) % div;
            n -= 3;
        }
        return (int) (res * n % div);
    }
}
