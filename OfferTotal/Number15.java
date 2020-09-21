package OfferTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/9 14:04
 */
public class Number15 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
}
