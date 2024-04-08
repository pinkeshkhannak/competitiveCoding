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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
           int size = queue.size();
           List<Integer> ds = new ArrayList<>();
           for(int i =0;i<size;i++) {
               TreeNode temp = queue.poll();
               ds.add(temp.val);
               if(temp.left != null) {
                   queue.add(temp.left);
               }
               if(temp.right != null) {
                   queue.add(temp.right);
               }
           }
           ans.add(new ArrayList<>(ds));
        }
        return ans;
    }
    
}