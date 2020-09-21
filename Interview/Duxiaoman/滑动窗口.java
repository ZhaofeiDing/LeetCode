package Interview.Duxiaoman;

import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/20 16:33
 */
public class 滑动窗口 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int u = sc.nextInt();
        int t = sc.nextInt();
        int base = u * t % 10;
        int multiply = (x - u + 1) * (y - t + 1);
        System.out.println(9 * multiply);
    }
}
