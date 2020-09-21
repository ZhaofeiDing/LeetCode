package 每日一题.Year2020April;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/9 0:10
 */
public class 第9天括号生成 {

    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs("", n, n);
        return res;
    }

    public void dfs(String cur, int left, int right) {
        if (left > right) {
            return;
        }
        if (left == 0 && right == 0) {
            res.add(cur);
        }
        if (left > 0) {
            dfs(cur + "(", left - 1, right);
        }
        if (right > 0) {
            dfs(cur + ")", left, right - 1);
        }
    }
}
