package OfferTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/22 23:09
 */
public class Number4 {
    //暴力搜索
//    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j] == target)
//                    return true;
//            }
//        }
//        return false;
//    }

    //从左下角开始，如果比目标数小，则右移，如果比目标数大，则上移
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int row = rows - 1, column = 0;
        while (row >= 0 && column < columns) {
            if (matrix[row][column] == target) {
                return true;
            } else if (matrix[row][column] < target) {
                column++;
            } else if (matrix[row][column] > target) {
                row--;
            }
        }
        return false;
    }
}
