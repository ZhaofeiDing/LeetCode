package 每日一题.Year2020April;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/17 17:47
 */
public class 第17天跳跃游戏55 {
//    public boolean canJump(int[] nums) {
//        int n = nums.length;
//        if (n == 0) {
//            return false;
//        }
//        boolean[] dp = new boolean[n];
//        dp[0] = true;
//        for (int i = 0; i < n - 1; i++) {
//            if (dp[i] && nums[i] != 0) {
//                for (int j = 1; j <= nums[i]; j++) {
//                    if (i + j <= n - 1) {
//                        dp[i + j] = true;
//                    }
//                }
//            }
//        }
//        return dp[n - 1];
//    }

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            if (i > maxLen) {
                return false;
            }
            maxLen = Math.max(maxLen, i + nums[i]);
        }
        return true;
    }
}
