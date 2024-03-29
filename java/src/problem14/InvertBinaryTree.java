/**********************************************************************************
 *
 * Given the root of a binary tree, invert the tree, and return its root.
 *
 **********************************************************************************/

package problem14;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            invertTree(root.right);
            invertTree(root.left);
        }
        return root;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
