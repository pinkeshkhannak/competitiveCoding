class Solution {
    public void dfs(int[][] image, int sr, int sc, int color, boolean[][] vis, int temp) {
        if(sr<0 || sc<0|| sr>=image.length||sc>=image[0].length||vis[sr][sc]||image[sr][sc] != temp) return;
        vis[sr][sc] = true;
        if(image[sr][sc] == temp) image[sr][sc] = color;
        dfs(image,sr+1,sc,color,vis,temp);
        dfs(image,sr-1,sc,color,vis,temp);
        dfs(image,sr,sc+1,color,vis,temp);
        dfs(image,sr,sc-1,color,vis,temp);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        int temp = image[sr][sc];
        dfs(image,sr,sc,color,vis,temp);
        return image;
    }
}