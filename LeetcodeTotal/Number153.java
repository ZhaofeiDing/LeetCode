package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/5 18:45
 */
public class Number153 {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
