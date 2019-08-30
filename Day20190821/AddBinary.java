package Day20190821;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int maxLen = Math.max(a.length(), b.length());
        int cur = 0;
        for(int i = 0;i < maxLen;i++){
            int x = (i < a.length()) ? a.charAt(a.length() - 1 - i) - '0' : 0;
            int y = (i < b.length()) ? b.charAt(b.length() - 1 - i) - '0' : 0;
            int sum = cur + x + y;
            sb.insert(0, sum % 2);
            cur = sum / 2;
        }
        if(cur > 0){
            sb.insert(0, cur);
        }
        return sb.toString();
    }
}
