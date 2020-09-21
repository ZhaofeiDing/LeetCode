package Interview.WangYi.网易互娱;

import java.util.*;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/11 19:24
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] ans = new String[n][2];
        String space = sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] s2 = s.split(" ");
            for (int j = 0; j < s2.length; j++) {
                ans[i][j] = s2[j];
            }
        }
        Arrays.sort(ans);
        System.out.print(ans[0]);
        System.out.print(1);


    }
}
