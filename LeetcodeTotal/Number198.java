package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/24 17:53
 */
public class Number198 {
    public int rob(int[] nums) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < nums.length; i++) {
            c = Math.max(a + nums[i], b);
            a = b;
            b = c;
        }
        return b;
    }
}
