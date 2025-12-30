class Solution {
    public int islandPerimeter(int[][] grid) {int cnt=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    if(j>0 && grid[i][j-1]==0 || j==0){
                        cnt++;
                    }
                     if(i>0 && grid[i-1][j]==0 || i==0){
                        cnt++;
                    } if(j<c-1 && grid[i][j+1]==0|| j==c-1){
                        cnt++;
                    } if(i<r-1 && grid[i+1][j]==0 || i==r-1){
                        cnt++;
                    }
                }
            }
        }return cnt;
    }
}