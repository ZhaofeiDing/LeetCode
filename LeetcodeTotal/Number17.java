package LeetcodeTotal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/10 21:50
 */
public class Number17 {
    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};
    //DFS + 递归
//    public List<String> letterCombinations(String digits) {
//        List<String> result = new ArrayList<>();
//        if (digits.length() != 0) {
//            DFS(result, "", digits);
//        }
//        return result;
//    }
//
//    private void DFS(List<String> result, String comb, String next_digits) {
//        if (next_digits == null || next_digits.length() == 0) {
//            result.add(comb);
//        } else {
//            String digit = next_digits.substring(0, 1);
//            String letters = phone.get(digit);
//            for (int i = 0; i < letters.length(); i++) {
//                String letter = letters.substring(i, i + 1);
//                DFS(result, comb + letter, next_digits.substring(1));
//            }
//        }
//    }

    //BFS + 队列
    public List<String> letterCombinations(String digits) {
        //如果数字为空，则返回空列表
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        //结果列表中加入空字符串，保证result.size()>0，可以执行之后的代码
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            //依次从digits中取出每一个数字，然后转换成对应的字母序列
            String letters = phone.get(""+digits.charAt(i));
            //必须提前得到result列表的长度值，因为result列表的长度是实时更新的
            int n = result.size();
            //从头依此取出result列表中的每一个字符串，并将其与新加入的字母进行拼接
            for (int j = 0; j < n; j++) {
                //每次取出result列表中的第一个字符串
                String temp = result.remove(0);
                //将result列表中的每一个元素分别与每一个字母进行拼接
                for (int k = 0; k < letters.length(); k++) {
                    result.add(temp + letters.substring(k, k + 1));
                }
            }
        }
        return result;
    }

}
