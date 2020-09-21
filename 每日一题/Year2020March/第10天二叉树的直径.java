package 每日一题.Year2020March;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/10 23:58
 */
public class 第10天二叉树的直径 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        depth(root);
        return ans;
    }

    public int depth(TreeNode node) {
        if (node == null)
            return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L + R);
        return 1 + Math.max(L, R);

    }
}
