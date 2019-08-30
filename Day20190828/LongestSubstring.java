package Day20190828;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0, n = s.length();
        for(int i = 0,j = 0;i < n && j < n;j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
//        Set<Character> set = new HashSet<>();
//        int i = 0,j = 0,ans = 0,n = s.length();
//        while(i < n && j < n){
//            if(!set.contains(s.charAt(j))){
//                set.add(s.charAt(j++));
//                ans = Math.max(ans, j - i);
//            }else{
//                set.remove(s.charAt(i++));
//            }
//        }
//        return ans;
    }
}
