package 每日一题.Year2020April;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/3 23:55
 */
public class 第3天atoi8 {
    public int myAtoi(String str) {
        char[] ch = str.toCharArray();
        int index = 0, n = ch.length;
        while (index < n && ch[index] == ' ') {
            index++;
        }
        if (index == n) {
            return 0;
        }

        boolean negative = false;
        if (ch[index] == '-') {
            index++;
            negative = true;
        } else if (ch[index] == '+') {
            index++;
            negative = false;
        } else if (!Character.isDigit(ch[index])) {
            return 0;
        }

        int ans = 0;
        while (index < n && Character.isDigit(ch[index])) {
            int digit = ch[index] - '0';
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + digit;
            index++;
        }

        return negative ? -ans : ans;
    }
}
