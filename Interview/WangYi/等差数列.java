package Interview.WangYi;

import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/7 20:06
 */
public class 等差数列 {
    //最大公约数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] input = new long[n];
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            input[i] = a;
        }
        long[] temp = new long[n - 1];
        int res = -100;
        for (int i = 1; i < n; i++) {
            long step = input[i] - input[i - 1];
            if (step <= 0) {
                res = -1;
                break;
            } else {
                temp[i - 1] = step;
            }
        }
        if (res == -1) {
            System.out.println(-1);
        } else {
            long gc = temp[0];
            for (int i = 1; i < temp.length; i++) {
                gc = gcd(gc, temp[i]);
            }
            System.out.println(gc);
        }


    }

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
