class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      
      HashSet<List<Integer>> set = new HashSet<>();
      for(int i =0;i<nums.length;i++) {
         HashSet<Integer> hs = new HashSet<>();
         for(int j = i+1; j< nums.length;j++) {
                  int target = -(nums[i] + nums[j]);
                  if(hs.contains(target)) {
                      List<Integer> ds = new ArrayList<>();
                      ds.add(nums[i]);
                      ds.add(nums[j]);
                      ds.add(target);
                      Collections.sort(ds);
                      set.add(ds);
                 }else {
                    hs.add(nums[j]);  
                 }
             }
         } 
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
      }  
        
    }