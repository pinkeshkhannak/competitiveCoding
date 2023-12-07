class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()) {
            List<Integer> ans = new ArrayList<>();
            int size = q.size();
            for(int i = 0;i<size;i++) {
                TreeNode node = q.poll();
                ans.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            list.add(ans);  
        }
        return list;
    }
}