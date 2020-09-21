package OfferTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/12 14:58
 */
public class Number17 {
    public int[] printNumbers(int n) {
        int size = (int) Math.pow(10, n) - 1;
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
