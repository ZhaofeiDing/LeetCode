package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/18 22:11
 */
public class Number11 {
    //    public int maxArea(int[] height) {
//        //暴力破解法
//        int maxArea = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
//            }
//        }
//        return maxArea;
//    }
    public int maxArea(int[] height) {
        //双指针法
        int maxArea = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
