/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void postOrder(TreeNode root, List<Integer> ds) {
        if(root == null) {
            return;
        }
        if(root.left != null) {
            postOrder(root.left, ds);
        }
        if(root.right != null) {
            postOrder(root.right, ds);
        }
        ds.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        postOrder(root, ds);
        return ds;
    }
}