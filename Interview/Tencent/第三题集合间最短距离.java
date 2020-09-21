package Interview.Tencent;

import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/26 20:51
 */
public class 第三题集合间最短距离 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String x = sc.nextLine();
            int n = Integer.parseInt(x);
            long[][] A = new long[n][2];
            long[][] B = new long[n][2];
//            sc.nextLine();
            for (int j = 0; j < n; j++) {
                String position = sc.nextLine();
                String[] pos = position.split("\\s+");
                A[j][0] = Long.parseLong(pos[0]);
                A[j][1] = Long.parseLong(pos[1]);
            }
            for (int k = 0; k < n; k++) {
                String position = sc.nextLine();
                String[] pos = position.split("\\s+");
                B[k][0] = Long.parseLong(pos[0]);
                B[k][1] = Long.parseLong(pos[1]);
            }
            double minDis = Double.MAX_VALUE;
            for (int m = 0; m < n; m++) {
                for (int p = 0; p < n; p++) {
                    double temp = minDistance(A[m][0], A[m][1], B[p][0], B[p][1]);
                    if (minDis > temp) {
                        minDis = temp;
                    }
                }
            }
            System.out.println(String.format("%.3f", minDis));
        }
    }

    public static double minDistance(long a, long b, long c, long d) {
        return Math.pow((Math.pow(a - c, 2) + (Math.pow(b - d, 2))), 0.5);
    }
}
