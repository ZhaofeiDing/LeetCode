package Interview.Ali;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/2 0:42
 */
public class 单词拆分 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        Set<String> set = new HashSet<>();
        for (String word : wordDict) {
            set.add(word);
        }
        dp[0] = true;
        for (int r = 1; r < s.length(); r++) {
            for (int l = 0; l < r; l++) {
                if (dp[l] && set.contains(s.substring(l, r))) {
                    dp[r] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
