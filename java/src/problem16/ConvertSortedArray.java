/**********************************************************************************
 *
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced
 * binary search tree.
 *
 **********************************************************************************/

package problem16;

public class ConvertSortedArray {

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return createBST(nums, 0, nums.length - 1);
    }

    private static TreeNode createBST(int[] nums, int l, int r) {
        if (l > r) return null;
        int mid = (l + r) / 2;
        TreeNode head = new TreeNode(nums[mid]);
        head.left = createBST(nums, l, mid - 1);
        head.right = createBST(nums, mid + 1, r);
        return head;
    }

    public static class TreeNode {
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
