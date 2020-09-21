package Interview.Pdd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/10 18:49
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String kong = sc.nextLine();
        String s = sc.nextLine();
        int[] num = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            num[i] = c - '0';
        }
        int[] dup = new int[10];
        for (int i = 0; i < num.length; i++) {
            dup[num[i]]++;
        }
        int max = -1, index = -1;
        for (int i = 0; i < dup.length; i++) {
            if (dup[i] > max) {
                max = dup[i];
                index = i;
            }
        }
        int yu = k - max;
        System.out.println(yu);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }
}
