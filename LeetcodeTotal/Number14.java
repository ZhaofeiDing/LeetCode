package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/1/20 22:28
 */
public class Number14 {
//    public String longestCommonPrefix(String[] strs) {
//        if(strs.length == 0 || strs == null){
//            return "";
//        }
//        String prefix = strs[0];
//        for(int i = 1;i < strs.length;i++){
//            while(!strs[i].startsWith(prefix)){
//                prefix = prefix.substring(0, prefix.length() - 1);
//                if(prefix.length() == 0){
//                    return "";
//                }
//            }
//        }
//        return prefix;
//    }
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for(int i = 1;i < strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.length() == 0)
                    return "";
            }
        }
        return prefix;
    }
}
