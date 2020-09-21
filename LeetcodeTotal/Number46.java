package LeetcodeTotal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/21 22:49
 */
public class Number46 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            return new LinkedList<>();
        }
        int n = nums.length;
        LinkedList<Integer> track = new LinkedList<>();
        dfs(nums, track);
        return res;
    }

    public void dfs(int[] nums, LinkedList<Integer> track) {
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i]))
                continue;
            track.add(nums[i]);
            dfs(nums, track);
            track.removeLast();
        }
    }
}
