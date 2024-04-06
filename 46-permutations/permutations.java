class Solution {
    public void allPermute(int ind, List<Integer> ds, int[] nums, List<List<Integer>> ans, boolean vis[]) {
        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0;i<nums.length;i++) {
            if(vis[i] == false) {
                vis[i] = true;
                ds.add(nums[i]);
                allPermute(i+1,ds, nums, ans, vis);
                ds.remove(ds.size()-1);
                vis[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       boolean vis[] = new boolean[nums.length];
       List<Integer> ds = new ArrayList<>();
       allPermute(0,ds, nums, ans, vis);
       return ans;
    }
}