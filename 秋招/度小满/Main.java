package 秋招.度小满;

import java.util.*;

/**
 * @author Zhaofei.Ding
 * @date 2020/9/20 18:19
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int zushu = sc.nextInt();
        for(int i=0;i<zushu;i++){
            int row = sc.nextInt();
            int col = sc.nextInt();
            int initRow = 0,initCol = 0;
            int useTime = 0;
            Character[][] array = new Character[row][col];
            Queue<int[]> queue = new LinkedList<>();
            for(int j=0;j<row;j++){
                String rowStr = sc.nextLine();
                for(int k=0;k<col;k++){
                    char c = rowStr.charAt(k);
                    if(c == '@'){
                        initRow = j;
                        initCol = k;
                        queue.offer(new int[]{j, k});
                    }
                    array[j][k] = c;
                }
            }

            int ans = 0;
            xunhuan : while (!queue.isEmpty()) {
                int size = queue.size();
                for (int m = 0; m < size; m++) {
                    int[] point = queue.poll();
                    int x = point[0];
                    int y = point[1];
                    for (int[] direction : directions) {
                        int newX = x + direction[0];
                        int newY = y + direction[1];
                        if (newX < 0 || newX >= row || newY < 0 || newY >= col) {
                            break xunhuan;
                        }
                        if(array[newX][newY] == '.'){
                            queue.offer(new int[]{newX, newY});
                        }
                        if(array[newX][newY] == '*'){
                            queue.offer(new int[]{newX, newY});
                            ans++;
                        }
                    }
                }
            }

            System.out.println(ans);

        }
    }

}
