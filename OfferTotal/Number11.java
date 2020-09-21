package OfferTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/3 22:39
 */
public class Number11 {
    public int minArray(int[] numbers) {
        int res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]){
                res = numbers[i];
                break;
            }
        }
        return res;
    }
}
