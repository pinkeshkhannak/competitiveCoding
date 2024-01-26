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
    public void inOrder(TreeNode node, List<Integer> ds) {
        if(node == null) {
            return;
        }
        
        if(node.left != null) {
            inOrder(node.left, ds);
        }
        ds.add(node.val);
        if(node.right != null) {
            inOrder(node.right, ds);
        }
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        TreeNode node = root;
        List<Integer> ds = new ArrayList<>();
        inOrder(node, ds);
        return ds;
    }
}