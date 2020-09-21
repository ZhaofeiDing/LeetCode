package Interview.JD;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/18 20:31
 */
public class 第二题列车排座2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] times = new int[n][2];
        for (int i = 0; i < n; i++) {
            times[i][0] = sc.nextInt();
            times[i][1] = sc.nextInt();
        }
        Arrays.sort(times, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (times[i][0] <= times[i - 1][1]) {
                res++;
            }
        }
        System.out.println(res);
    }
}
