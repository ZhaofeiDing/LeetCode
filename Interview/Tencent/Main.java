package Interview.Tencent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/26 20:09
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            long x = sc.nextLong();
            int k = sc.nextInt();
            int step = (int) Math.ceil(log(2, x));
            if (k == 1) {
                System.out.println(1);
            } else if (k >= step) {
                System.out.println(-1);
            } else {
                long num = x;
                for (int j = step; j > k; j--) {
                    num = num / 2;
                }
                System.out.println(num);
            }
        }
    }

    public static double log(long base, long n) {
        return Math.log(n) / Math.log(base);
    }
}
