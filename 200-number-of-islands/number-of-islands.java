class Solution {
    public void dfs(int i, int j, boolean vis[][], char grid[][]) {
        int n = grid.length;
        int m = grid[0].length;

        if (i < 0 || j < 0 || i >= n || j >= m || vis[i][j] || grid[i][j] == '0') {
            return;
        }

        vis[i][j] = true;

        // Explore adjacent cells (horizontal and vertical movements)
        dfs(i + 1, j, vis, grid); // Down
        dfs(i - 1, j, vis, grid); // Up
        dfs(i, j + 1, vis, grid); // Right
        dfs(i, j - 1, vis, grid); // Left
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        if (n == 0) return 0;
        int m = grid[0].length;

        boolean vis[][] = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    count++;
                    dfs(i, j, vis, grid);
                }
            }
        }
        return count;
    }
}
