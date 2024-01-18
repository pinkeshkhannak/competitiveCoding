class Solution {
    public int Lis(int ind, int[] nums, int prev, int dp[][]) {
       if(ind == nums.length) {
           return 0;
       } 
       if(dp[ind][prev+1] != -1) return dp[ind][prev+1];
       int val= 0 + Lis(ind+1,nums,prev,dp);
       if(prev == -1 || nums[ind] > nums[prev]) {
         val =  Math.max(val,1+ Lis(ind+1,nums,ind,dp));
       }
       return dp[ind][prev+1] = val ;
    } 
    public int lengthOfLIS(int[] nums) {
        int dp[][] = new int[nums.length][nums.length];
        for(int i=0;i<dp.length;i++) {
            for(int j =0;j<dp[0].length;j++) {
                dp[i][j] = -1;
            }
        }
        return Lis(0,nums,-1,dp);
    }
}