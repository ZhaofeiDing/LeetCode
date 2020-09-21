package 每日一题.Year2020April;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/1 15:41
 */
public class 第1天有效括号的嵌套深度1111 {

    //将左括号按奇数和偶数分别分配给A(0),B(1),右括号分配给对应的A，B
    public int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];
        int index = 0;
        for(char c: seq.toCharArray()){
            res[index++] = c == '(' ? index & 1 : (index+1) & 1;
        }
        return res;
    }
}
