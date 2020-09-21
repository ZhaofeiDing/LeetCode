package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/20 17:47
 */
public class Number122 {

//    public static void main(String[] args) {
//        int[] prices = {3,3};
//        System.out.println(maxProfit(prices));
//    }
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    //峰谷法
//    public int maxProfit(int[] prices) {
//        if(prices.length == 0)
//            return 0;
//        int profit = 0;
//        int vally = prices[0], peek = prices[0];
//        int i = 0;
//        while (i < prices.length - 1) {
//            //等号十分重要，可以判断相等序列，下同
//            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
//                i++;
//            vally = prices[i];
//            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
//                i++;
//            peek = prices[i];
//            profit += peek - vally;
//        }
//        return profit;
//    }
}
