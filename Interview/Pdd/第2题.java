package Interview.Pdd;

import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/10 18:54
 */
public class 第2题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] tree = new int[n];
        for (int i = 0; i < n; i++) {
            tree[i] = sc.nextInt();
        }
        if(m == 1){
            System.out.println(n*(n-1)/2);
        }else{
            int res = 0;
            long[][] dp = new long[n][n];
            for (int i = 0; i < n; i++) {
                dp[i][0] = tree[i];
                if (dp[i][0] % m == 0 && dp[i][0] != 0) {
                    res++;
                }
            }

            for (int step = 1; step < n; step++) {
                for (int i = step; i < n; i++) {
                    dp[i][step] = dp[i - 1][step - 1] + tree[i];
                    if(dp[i][step] % m == 0 && dp[i][step] != 0){
                        res++;
                    }
                }
            }
            System.out.println(res);
        }



//        int res = 0, tempStep = 0;
//        int tempNum = 0;
//        for (int step = 1; step <= n; step++) {
//            for (int i = 0; i < n; i++) {
//                int j = i;
//                while(i + step <= n && tempStep < step){
//                    tempNum += tree[j];
//                    j++;
//                    tempStep++;
//                }
//                if(tempNum % m == 0 && tempNum != 0){
////                    System.out.print(" " +step +" "+i+" "+ tempNum);
//                    res++;
//                }
////                System.out.println();
//                tempNum = 0;
//                tempStep = 0;
//            }
//        }
////        System.out.println();
//        System.out.println(res);
    }
}
