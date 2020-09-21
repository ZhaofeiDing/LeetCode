package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/19 21:15
 */
public class Number34 {
    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        range[0] = left_range(nums, target);
        range[1] = right_range(nums, target);
        return range;
    }

    public int left_range(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        if (left == nums.length) {
            return -1;
        }
        return nums[left] == target ? left : -1;
    }

    public int right_range(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (left == 0) {
            return -1;
        }
        return nums[left - 1] == target ? left - 1 : -1;
    }


}
