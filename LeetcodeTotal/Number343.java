package LeetcodeTotal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/6 23:57
 */
public class Number343 {
//    public int integerBreak(int n) {
//        //暴力法(超时)
//        int res = 0;
//        for (int i = 1; i <= n - 1; i++) {
//            res = Math.max(res, Math.max(i * (n - i), i * integerBreak(n - i)));
//        }
//        return res;
//    }

    //自顶向下法优化
//    int[] memo;
//
//    public int integerBreak(int n) {
//        if (n <= 3) {
//            return n - 1;
//        }
//        memo = new int[n + 1];
//        return integerBreakHelper(n);
//    }
//
//    public int integerBreakHelper(int n) {
//        if (memo[n] != 0) {
//            return memo[n];
//        }
//        int res = 0;
//        for (int i = 1; i < n - 1; i++) {
//            res = Math.max(res, Math.max(i * (n - i), i * integerBreakHelper(n - i)));
//        }
//        memo[n] = res;
//        return res;
//    }


    //动态规划
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }

}
