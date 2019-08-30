package Day20190819;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int []ce = {2, 7, 11, 15, 56, 12};
        int []x = new int[2];
        x = twoSum(ce, 14);
        System.out.println(x[0]+" "+x[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = m.get(target - nums[i]);
                break;
            }
            m.put(nums[i], i);
        }
        return res;
    }
}
