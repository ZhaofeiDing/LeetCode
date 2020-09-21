package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/9 17:17
 */
public class Number191 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n = n & (n - 1);
        }
        return res;
    }
}
