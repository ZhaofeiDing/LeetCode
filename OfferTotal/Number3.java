package OfferTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/22 22:13
 */
public class Number3 {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        int[] flag = new int[n];
        for (int i = 0; i < n; i++) {
            flag[nums[i]]++;
        }
        int result = 0;
        for (int j = 0; j < n; j++) {
            if (flag[j] > 1){
                result = j;
                break;
            }
        }
        return result;
    }
}
