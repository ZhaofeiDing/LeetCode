package Interview.Pdd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/10 18:54
 */
public class 第1题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        Arrays.sort(price);
        long res = 0;
        int index = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (index % 3 != 0) {
                res += price[i];
            }
            index++;
        }
        System.out.println(res);
    }
}
