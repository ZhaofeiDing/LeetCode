package Day20190819;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = new ArrayList<>();
        res = threeSum(nums);
        Iterator it = res.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            int firstNum = nums[i];
            int twoNumTarget = 0 - firstNum;
            if(i != 0 && nums[i] == nums[i-1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int temp = nums[left] + nums[right];
                if (temp == twoNumTarget) {
                    res.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                    while(left < right && nums[left] == nums[left-1])   left++;
                    while(right > left && nums[right] == nums[right+1])    right--;
                } else if (temp < twoNumTarget) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}
