class Solution {
    public int lcs(int ind1, int ind2, String s1, String s2, int dp[][]) {
        
        if(ind1 <0 || ind2 < 0) {
            return 0;
        }
        
        if(dp[ind1][ind2] != -2) return dp[ind1][ind2];

        if(s1.charAt(ind1) == s2.charAt(ind2)) {
            return dp[ind1][ind2 ] = 1 + lcs(ind1-1, ind2-1, s1, s2, dp);
        }
        
        return dp[ind1][ind2 ] = Math.max(lcs(ind1-1, ind2, s1, s2, dp),lcs(ind1, ind2-1, s1, s2, dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int ind1 = text1.length()-1;
        int ind2 = text2.length()-1;
        int dp[][] = new int[ind1+1][ind2+1];
        for(int i = 0;i< dp.length;i++) {
            for(int j = 0;j<dp[0].length;j++) {
                dp[i][j] = -2;
            }
        }
        return lcs(ind1, ind2, text1, text2, dp);
    }
}