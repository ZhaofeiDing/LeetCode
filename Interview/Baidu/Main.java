package Interview.Baidu;

import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/29 18:51
 */
public class Main {
    //第一题
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(lcm(n, n - 1) - gcd(n, n - 1));
    }

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
