class Solution {
    class Pair {
        int row;
        int col;
        int count;
        Pair(int row, int col, int count) {
            this.row = row;
            this.col = col;
            this.count = count;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        Queue<Pair> queue = new LinkedList<>();
        int freshOranges = 0;
        
        for(int i =0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 2) {
                 queue.add(new Pair(i,j,0));
                    vis[i][j] = 2;
                }
                else { 
                    vis[i][j] = 0;
                }
                if(grid[i][j] == 1) freshOranges++;
                
            }
        }
        
        int row[] = new int[]{-1, 0, 1, 0};
        int col[] = new int[]{0, 1, 0, -1};
        int ans = 0;
        while(!queue.isEmpty()) {
            int r = queue.peek().row;
            int c = queue.peek().col;
            int count = queue.peek().count;
            ans = Math.max(count, ans);
            queue.poll();
            for(int i = 0; i< 4;i++) {
                int nrow = r + row[i];
                int ncol = c + col[i];
                if(nrow>=0 && ncol>=0 && nrow < n && ncol < m && vis[nrow][ncol] != 2 && grid[nrow][ncol] == 1) {
                    queue.add(new Pair(nrow,ncol,count+1));
                    vis[nrow][ncol] = 2;
                    freshOranges--;
                }
            }
        }
        
        return freshOranges == 0 ? ans : -1;
        
    }
}