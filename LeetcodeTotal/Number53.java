package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/11 20:53
 */
public class Number53 {
    //    public int maxSubArray(int[] nums) {
//        int curNum = nums[0], maxNum = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            curNum = Math.max(curNum + nums[i], nums[i]);
//            maxNum = Math.max(maxNum, curNum);
//        }
//        return maxNum;
//    }
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            maxSum = Math.max(maxSum, nums[i]);
        }
        return maxSum;
    }
}
