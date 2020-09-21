package LeetcodeTotal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/29 0:13
 */
public class Number139 {
    public static void main(String[] args) {
        String s = "leetcodeleetcode";
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        System.out.println(wordBreak(s, list) + " " + s + " " + s.length());
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        String s1 = s;
        for (String word : wordDict) {
            String s2 = s1.replace(word, "");
            s1 = s2;
        }
        if (s1.length() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
