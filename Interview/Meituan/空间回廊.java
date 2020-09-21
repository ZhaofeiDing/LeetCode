package Interview.Meituan;

import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/2 20:25
 */
public class 空间回廊 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        long[] room = new long[n];
        long min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            room[i] = sc.nextLong();
            min = Math.min(min, room[i]);
        }

        int ans = 0;
        int index = 0;
        while (m >= min) {
            if (m >= room[index % n]) {
                m -= room[index % n];
                ans++;
            }
            index++;
        }
        System.out.println(ans);

    }
}
