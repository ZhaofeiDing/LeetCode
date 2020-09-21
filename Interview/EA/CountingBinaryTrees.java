package Interview.EA;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/29 21:08
 */
public class CountingBinaryTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(2);
        } else {
            BigInteger res1 = cal(2 * n);
            BigInteger res2 = cal(n).multiply(cal(n + 1));
            BigInteger res = res1.divide(res2);
            System.out.println(res);
        }
//        System.out.println(cal(30000));
    }

    public static BigInteger cal(int n) {
        BigInteger x = new BigInteger("1");
        for (long i = 2; i <= n; i++) {
            x = x.multiply(BigInteger.valueOf(i));
        }
        return x;
    }
}
