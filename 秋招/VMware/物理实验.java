package 秋招.VMware;

import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/9/21 20:56
 */
public class 物理实验 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            double nLen = sc.nextDouble();
            int mTime = sc.nextInt();
            double rMove = sc.nextDouble();
            double totalLen = 0.0, dis = 0.0;
            long p;
            for (int i = 1; i <= mTime; i++) {
                totalLen = i * rMove;
                p = (long) (totalLen / nLen);
                dis = totalLen - p * nLen;
                p = p % 4;
                if (p == 0) {
                    System.out.println(String.format("%.2f", dis) + " 0.00");
                } else if (p == 1) {
                    System.out.println(String.format("%.2f", nLen)+" "+String.format("%.2f",dis));
                } else if (p == 2) {
                    System.out.println(String.format("%.2f", nLen - dis)+" "+String.format("%.2f",nLen));
                } else if (p == 3) {
                    System.out.println("0.00 "+String.format("%.2f", nLen - dis));
                }
            }

        }
    }
}
