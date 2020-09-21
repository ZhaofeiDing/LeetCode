package OfferTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/10 15:31
 */
public class Number16 {
    public double myPow(double x, int n) {
        //常规解法（超时）
//        if(n == 0)
//            return 1;
//        int flag = 0, exp = n;
//        if (n < 0) {
//            exp = -n;
//            flag = 1;
//        }
//        double res = 1;
//        while (exp > 0) {
//            res *= x;
//            exp--;
//        }
//        if (flag == 0) {
//            return res;
//        } else {
//            return 1 / res;
//        }

        //快速幂
        if (x == 0)
            return 0;
        long exp = n;
        if (n < 0) {
            //这里很关键，只能为-exp，不能是-n,-n已经超出int的范围了
            exp = -exp;
            x = 1 / x;
        }
        double res = 1.0;
        while (exp > 0) {
            if ((exp & 1) == 1)
                res *= x;
            x *= x;
            exp >>= 1;
        }
        return res;
    }
}
