package Day20190820;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int min = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        int tempMin = nums[0] + nums[1] + nums[2];
        int tempMax = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
        if(tempMin > target)
            return tempMin;
        if(tempMax < target)
            return tempMax;
        for(int i = 0; i < nums.length - 2;i++){
            int left = i + 1, right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - sum) < Math.abs(target - min)){
                    min = sum;
                }
                if(sum < target)    left++;
                else    right--;
            }
        }
        return min;
    }
}
