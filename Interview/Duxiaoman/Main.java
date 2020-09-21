package Interview.Duxiaoman;

import java.util.Scanner;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/20 16:33
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int subCost = sc.nextInt();
        int addCost = sc.nextInt();
        int[] cities = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            cities[i] = sc.nextInt();
        }

        int temp = 1;
        int origin = cities[temp], addNext = cities[origin + 1], subNext = cities[origin - 1];
        int res = 0;
        while (temp != N) {
//            if (origin > 1 && origin < N) {
            if (cities[origin] > subNext - subCost && cities[origin] > addNext - addCost) {
                temp = origin;
                origin = cities[temp];
                addNext = cities[origin + 1];
                subNext = cities[origin - 1];
                res = res + a;
            } else if (subNext - subCost > cities[origin] && subNext - subCost > addNext - addCost) {
                temp = cities[origin - 1];
                origin = cities[temp];
                addNext = cities[origin + 1];
                subNext = cities[origin - 1];
                res = res + a + subCost;
            } else if (addNext - addCost > subNext - subCost && addNext - addCost > cities[origin]) {
                temp = cities[origin + 1];
                origin = cities[temp];
                addNext = cities[origin + 1];
                subNext = cities[origin - 1];
                res = res + a + addCost;
            }
//            }
        }

        System.out.println(res);

    }
}
