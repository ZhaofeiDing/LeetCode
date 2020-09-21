package OfferTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/23 18:23
 */
public class Number5 {
    public String replaceSpace(String s) {
//        return s.replace(" ","%20");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == ' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c==' ')
                sb.append("%20");
            sb.append(c);
        }
        return sb.toString();
    }
}
