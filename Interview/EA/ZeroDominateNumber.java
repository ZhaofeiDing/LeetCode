package Interview.EA;

import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/29 21:09
 */
public class ZeroDominateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(",");
        int sum = 0;
        for (int i = Integer.parseInt(s1[0]); i <= Integer.parseInt(s1[1]); i++) {
            if (count(i)) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static boolean count(int n) {
        long one = 0, zero = 0;
        while (n != 0) {
            int bit = n % 2;
            n = n / 2;
            if (bit == 0) {
                zero++;
            } else if (bit == 1) {
                one++;
            }
        }
        if (zero >= one) {
            return true;
        } else {
            return false;
        }
    }
}
