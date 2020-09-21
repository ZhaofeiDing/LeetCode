package Interview.Pdd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/10 20:26
 */
public class 第4题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            color[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int max = -1;
        for (int i = 1; i < n; i++) {
            if (color[i] == color[i - 1]) {
                dp[i] = dp[i - 1] + 1;
                max = Math.max(max,dp[i]);
            }
        }
        System.out.println(max);
    }
}
