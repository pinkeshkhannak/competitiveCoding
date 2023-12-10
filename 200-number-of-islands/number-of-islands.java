class Solution {
    public void dfs(int i, int j, boolean vis[][], char grid[][]) {
        int n = grid.length;
        int m = grid[0].length;
        if(i<0||j<0||i>=n||j>=m||grid[i][j] == '0'||vis[i][j]) {
            return;
        } 
        vis[i][j] = true;
        dfs(i+1,j,vis,grid);
        dfs(i-1,j,vis,grid);
        dfs(i,j+1,vis,grid);
        dfs(i,j-1,vis,grid);
        
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        if (n == 0) return 0;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        int count = 0;
        for(int i = 0;i<n;i++) {
            for(int j =0;j<m;j++) {
                if(!vis[i][j] && grid[i][j] == '1') {
                    count++;
                    dfs(i,j,vis,grid);
                }
            }
        }
        return count;
    }
}