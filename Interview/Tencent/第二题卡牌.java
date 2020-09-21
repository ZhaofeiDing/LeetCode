package Interview.Tencent;

import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/26 21:19
 */
public class 第二题卡牌 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cards = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                cards[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(cards[1][j] < cards[1][i]){

                }
            }
        }
    }
}
