package LeetcodeTotal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Zhaofei.Ding
 * @date 2020/2/21 21:27
 */
public class Number104 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //递归
//    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        } else {
//            int left_height = maxDepth(root.left);
//            int right_height = maxDepth(root.right);
//            return Math.max(left_height, right_height) + 1;
//        }
//    }

    //迭代，通过队列实现
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
        }
        return depth;
    }

}
