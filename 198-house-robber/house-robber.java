class Solution {
    public int maxAmount(int ind, int[] nums, int dp[]) {
        if(ind >= nums.length) {
            return 0;
        }
        if(dp[ind] != -1) return dp[ind];
        int left =  nums[ind] + maxAmount(ind+2,nums,dp);  
        
        int right =  maxAmount(ind+1,nums,dp);
        return dp[ind] = Math.max(left,right);
    }
    public int rob(int[] nums) { 
        int dp[] = new int[nums.length];
        for(int i=0;i<dp.length;i++) {
            dp[i] = -1;
        }
        return maxAmount(0,nums,dp);
    }
}




