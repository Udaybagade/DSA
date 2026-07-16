class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int curc=image[sr][sc];
        if(curc==color )return image;
       
        dfs(sr,sc,color,image,curc);
        return image;
    }
    void dfs(int i,int j,int color,int[][] image,int curc){
        if(i<0 || i>=image.length||
            j<0 || j>= image[i].length
        ) return ;
        
        if(image[i][j]!=curc)return;

        image[i][j]=color;

        dfs(i-1,j,color,image,curc);
        dfs(i,j-1,color,image,curc);
        dfs(i+1,j,color,image,curc);
        dfs(i,j+1,color,image,curc);
    }
}