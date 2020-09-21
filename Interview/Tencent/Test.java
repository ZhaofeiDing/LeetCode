package Interview.Tencent;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/26 20:19
 */
public class Test {
    public static void main(String[] args) {
//        String s = "PUSH 532";
////        String s1 = s.substring(5);
//        String s1 = s.replace("PUSH ", "");
//        int x = Integer.parseInt(s1);
//        System.out.println(x);
//        System.out.println(minDistance(1,1,2,2));
//        double minDis = 78.32423543;
//        System.out.println(String.format("%.3f", minDis));
        System.out.println(Math.ceil(log(2,10)));
    }

    public static double log(long base,long n){
        return Math.log(n) / Math.log(base);
    }

    public static double minDistance(long a, long b, long c, long d) {
        return Math.pow((Math.pow(a - c, 2) + (Math.pow(b - d, 2))), 0.5);
    }

}

