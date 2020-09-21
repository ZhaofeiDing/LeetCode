package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/17 22:37
 */
public class Number70 {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
//        int first = 1, second = 2;
//        for (int i = 3; i <= n; i++) {
//            int third = first + second;
//            first = second;
//            second = third;
//        }
//        return second;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
