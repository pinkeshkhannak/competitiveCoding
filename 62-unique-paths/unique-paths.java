class Solution {
    public int PathCount(int m, int n, int dp[][]) {
        if(m == 0 && n ==0) {
            return 1;
        }
        if(dp[m][n] != -1) return dp[m][n];

        int up = 0;

        if(m > 0) {
            dp[m][n] = up =  PathCount(m-1,n,dp);
        }
        int left = 0;
        if(n > 0) {
           dp[m][n] = left = PathCount(m,n-1,dp);
        }
        return dp[m][n] = up + left;
    }
    public int uniquePaths(int m, int n) {
       int dp[][] = new int[m+1][n+1];
       for(int i =0;i<m+1;i++) {
           for(int j=0;j<n+1;j++) {
               dp[i][j] = -1;
           }
       }
       return PathCount(m-1,n-1,dp);
    }
}