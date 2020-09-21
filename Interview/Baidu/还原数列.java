package Interview.Baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/29 20:04
 */
public class 还原数列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            array[i] = x;
        }
        Arrays.sort(array);
        long res = 0;
        while (array[n - 1] >= n) {
            long k = array[n - 1] / n;
            array[n - 1] = array[n - 1] % n;
            for (int i = 0; i < n - 1; i++) {
                array[i] += k;
            }
            res += k;
            Arrays.sort(array);
        }
        System.out.println(res);
    }
}
