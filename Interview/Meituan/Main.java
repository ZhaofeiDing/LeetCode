package Interview.Meituan;

import java.util.*;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/2 18:51
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] p = new double[n];
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        double finalScore = 0.0;
        double tempP = p[0];
        for(int i=0;i<n;i++){
            finalScore += tempP * score[0];
            tempP *= tempP;
        }
        System.out.println(String.format("%.2f",finalScore));

    }
}
