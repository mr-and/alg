/**********************************************************************************
 *
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 *
 **********************************************************************************/

package problem8;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rec(root, ans);
        return ans;
    }

    public static void rec(TreeNode root, List<Integer> integers) {
        if(root == null) return;
        integers.add(root.val);
        rec(root.left, integers);
        rec(root.right, integers);

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
