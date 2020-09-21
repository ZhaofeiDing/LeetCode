package LeetcodeTotal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/18 23:01
 */
public class Number22 {
//    public List<String> generateParenthesis(int n) {
//        //深度优先遍历
//        if (n == 0) {
//            return new ArrayList<>();
//        }
//
//        List<String> res = new ArrayList<>();
//        dfs("", n, n, res);
//        return res;
//    }
//
//    /**
//     * @param curStr 当前符合条件的数组
//     * @param left   当前剩余的左括号数量
//     * @param right  当前剩余的右括号数量
//     * @param res    结果集
//     */
//    void dfs(String curStr, int left, int right, List<String> res) {
//        if (left == 0 && right == 0) {
//            res.add(curStr);
//            return;
//        }
//
//        //剩余的左括号数大于右括号数，进行剪枝
//        if (left > right) {
//            return;
//        }
//
//        if (left > 0) {
//            dfs(curStr + "(", left - 1, right, res);
//        }
//        if (right > 0) {
//            dfs(curStr + ")", left, right - 1, res);
//        }
//    }

    public List<String> generateParenthesis(int n) {
        //深度优先遍历
        if (n == 0) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        dfs("", n, 0,0, res);
        return res;
    }

    /**
     * @param curStr 当前符合条件的数组
     * @param sum    总括号数
     * @param left   当前使用的左括号数量
     * @param right  当前使用的右括号数量
     * @param res    结果集
     */
    void dfs(String curStr, int sum, int left, int right, List<String> res) {
        if (left == sum && right == sum) {
            res.add(curStr);
            return;
        }

        //使用的左括号数小于右括号数，进行剪枝
        if (left < right) {
            return;
        }

        if (left < sum) {
            dfs(curStr + "(",sum, left + 1, right, res);
        }
        if (right < sum) {
            dfs(curStr + ")",sum, left, right + 1, res);
        }
    }

}
