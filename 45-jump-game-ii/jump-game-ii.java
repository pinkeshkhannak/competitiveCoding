class Solution {
    public int minJump(int ind, int[] nums, int destination, int dp[]) {
        if (ind >= nums.length) {
            return Integer.MAX_VALUE;
        }
        if (ind >= destination) {
            return 0;
        }
        if(dp[ind] != -1) return dp[ind];
        int minSteps = Integer.MAX_VALUE;
        for (int i = 1; i <= nums[ind]; i++) {
            int stepsFromNext = minJump(ind + i, nums, destination, dp);
            if (stepsFromNext != Integer.MAX_VALUE) {
                minSteps = Math.min(minSteps, 1 + stepsFromNext);
            }
        }
        dp[ind] = minSteps; 
        return dp[ind];
    }
    
    public int jump(int[] nums) {
        int destination = nums.length - 1;
        int[] dp = new int[nums.length];
        for(int i =0;i<nums.length;i++) {
            dp[i] = -1;
        }
        return minJump(0, nums, destination, dp);
    }
}
