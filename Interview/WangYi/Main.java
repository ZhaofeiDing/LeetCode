package Interview.WangYi;

import java.sql.SQLOutput;
import java.util.*;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/7 18:51
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = shortestDistance(matrix, i, j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" ");
                System.out.print(ans[i][j]);
            }
            if (i != n - 1) {
                System.out.println();
            }
        }

    }

    public static int shortestDistance(int[][] matrix, int x, int y) {
        int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int step = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        int flag = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] temp = queue.poll();
                int x1 = temp[0];
                int y1 = temp[1];
                for (int[] direction : directions) {
                    int newX = x1 + direction[0];
                    int newY = y1 + direction[1];
                    if (newX < 0 || newX >= matrix.length || newY < 0 || newY >= matrix[0].length) {
                        continue;
                    }
                    if (matrix[newX][newY] == 0) {
                        flag = 1;
                        break;
                    }
                    if (matrix[newX][newY] == 1) {
                        queue.offer(new int[]{newX, newY});
                    }
                }
            }
            step++;
            if (flag == 1) {
                break;
            }
        }
        return step;
    }

}
