package Day20190822;

import java.math.BigInteger;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int n1 = num1.length(), n2 = num2.length();
        int []res = new int[n1+n2];
        for(int i = n1-1;i >= 0;i--){
            for(int j = n2-1;j >= 0;j--){
                int x = num1.charAt(i) - '0';
                int y = num2.charAt(j) - '0';
                res[i+j+1] += x*y;
            }
        }
        int carry = 0;
        for(int k = res.length-1;k >= 0;k--){
            int temp = (res[k] + carry) % 10;
            carry = (res[k] + carry) / 10;
            res[k] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for(int i: res){
            sb.append(i);
        }
        while(sb.length() != 0 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
