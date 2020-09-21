package 每日一题.Year2020April;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/7 0:23
 */
public class 第7天旋转矩阵 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //矩阵转置，即按斜对角线进行数据交换
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //矩阵根据中间列进行对折，得到最终结果
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
}
