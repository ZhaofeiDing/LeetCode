package Interview.Microsoft;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/20 14:37
 */
public class 寻找二分查找的左右边界 {
    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        range[0] = left_bound(target, nums);
        range[1] = right_bound(target, nums);
        return range;
    }

    public int left_bound(int target, int[] nums) {
        //right的值确定了查找的区间范围为左右都是闭区间，即[0,nums.length-1]
        int left = 0, right = nums.length - 1;
        //"="表示终止条件为left=right+1
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                right = mid - 1;
            }
        }
        /* 因为最后用left来返回答案，所以只要判断left的越界情况就可以了
        * 三种情况：1.target比所有数都要大，这时候left+1==nums.length,越界错误；
        *           2.target比所有数都要小，left一直在0的位置没移动，这时候只要判断nums[left] != target即可；
        *           3.target的值位于nums[0]-nums[length-1]之间，但不存在，这时候只要判断nums[left] != target即可*/
        if (left >= nums.length || nums[left] != target) {
            return -1;
        }
        return left;

    }

    public int right_bound(int target, int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (right < 0 || nums[right] != target) {
            return -1;
        }
        return right;
    }
}
