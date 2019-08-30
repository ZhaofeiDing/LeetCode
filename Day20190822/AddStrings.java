package Day20190822;

public class AddStrings {
    public static void main(String[] args) {
        String m = addStrings("123","456");
        System.out.println(m);
    }
    public static String addStrings(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int length = Math.max(m,n)+1;
        int []res = new int[length];
        int carry = 0;
        for(int i = 1;i <= length;i++){
            int x = (m-i) >= 0 ? num1.charAt(m-i) - '0' : 0;
            int y = (n-i) >= 0 ? num2.charAt(n-i) - '0' : 0;
            res[length-i] = (carry + x + y) % 10;
            carry = (carry + x + y) / 10;
        }
        StringBuilder sb = new StringBuilder();
        for(int i : res){
            sb.append(i);
        }
        while(sb.length() != 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
