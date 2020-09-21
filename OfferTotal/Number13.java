package OfferTotal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/6 15:15
 */
public class Number13 {

    //深度优先遍历
//    int m, n, k;
//    boolean[][] visited;

//    public int movingCount(int m, int n, int k) {
//        this.m = m;
//        this.n = n;
//        this.k = k;
//        visited = new boolean[m][n];
//        return dfs(0, 0);
//    }
//
//    public int dfs(int i, int j) {
//        int sum = sum(i) + sum(j);
//        if (i < 0 || i >= m || j < 0 || j >= n || sum > k || visited[i][j])
//            return 0;
//        visited[i][j] = true;
//        return 1 + dfs(i + 1, j) + dfs(i, j + 1);
//    }
//
//    public int sum(int n) {
//        int s = 0;
//        while (n != 0) {
//            s += n % 10;
//            n /= 10;
//        }
//        return s;
//    }


    //广度优先遍历
    public int movingCount(int m, int n, int k) {
        int res = 0;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int i = temp[0], j = temp[1];
            if (i < 0 || i >= m || j < 0 || j >= n || sum(i) + sum(j) > k || visited[i][j])
                continue;
            visited[i][j] = true;
            res++;
            queue.offer(new int[]{i + 1, j});
            queue.offer(new int[]{i, j + 1});
        }
        return res;
    }

    public int sum(int n) {
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}
