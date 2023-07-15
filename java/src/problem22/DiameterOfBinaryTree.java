/**********************************************************************************
 *
 * Given the root of a binary tree, return the length of the diameter of the tree.
 *
 **********************************************************************************/

package problem22;

public class DiameterOfBinaryTree {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }
    private int dfs(TreeNode current) {
        if (current == null) {
            return 0;
        }
        int left = dfs(current.left);
        int right = dfs(current.right);
        diameter = Math.max(diameter, (left + right));
        return Math.max(left, right) + 1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
