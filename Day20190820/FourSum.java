package Day20190820;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 3; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i + 1;j < nums.length - 2;j++){
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                int left = j+1;
                int right = nums.length - 1;
                while(left < right){
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        res.add(Arrays.asList(nums[i], nums[j], nums[left++], nums[right--]));
                        while(left < right && nums[left] == nums[left-1]) left++;
                        while(right > left && nums[right] == nums[right+1])  right--;
                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
