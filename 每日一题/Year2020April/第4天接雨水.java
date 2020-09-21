package 每日一题.Year2020April;

import java.util.Stack;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/9 22:45
 */
public class 第4天接雨水 {
    //动态规划
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }

        //dp[i][0]表示i位置左边的最大值，dp[i][1]表示i位置右边的最大值
        int[][] dp = new int[n][2];
        dp[0][0] = height[0];
        dp[n - 1][1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], height[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            dp[i][1] = Math.max(dp[i + 1][1], height[i]);
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.min(dp[i][0], dp[i][1]) - height[i];
        }
        return res;
    }


    //单调栈
    public int trap2(int[] height) {
        Stack<Integer> stack = new Stack();
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] < height[i]) {
                int bottomIdx = stack.pop();
                while (!stack.isEmpty() && height[stack.peek()] == height[bottomIdx]) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    res += (Math.min(height[stack.peek()], height[i]) - height[bottomIdx]) * (i - stack.peek() - 1);
                }
            }
            stack.push(i);
        }
        return res;
    }
}
