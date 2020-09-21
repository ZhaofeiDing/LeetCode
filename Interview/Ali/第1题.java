package Interview.Ali;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/10 9:56
 */
public class 第1题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] position = new int[n];
        for (int i = 0; i < n; i++) {
            position[i] = sc.nextInt();
            int y = sc.nextInt();
        }
        if(n == 1){
            System.out.println(position[0]);
        }else{
            Arrays.sort(position);
            int maxDup = -1;
            int[] t = new int[100001];
            for (int i = 0; i < position.length; i++) {
                t[position[i]]++;
            }
            int index = -1;
            for (int i = 0; i < t.length; i++) {
                if (t[i] > maxDup) {
                    maxDup = t[i];
                    index = i;
                }
            }
            int res = 0, res2 = 0;
            int temp = 1;
            if(n % 2 == 1){
                temp = position[n / 2];
            }else{
                if(t[position[n/2]] > t[position[n/2-1]]){
                    temp = position[n/2];
                }else{
                    temp = position[n/2-1];
                }

            }
            for (int i = 0; i < position.length; i++) {
                res += Math.abs(index - position[i]);
                res2 += Math.abs(temp - position[i]);
            }
            System.out.println(Math.min(res, res2));
        }

    }
}
