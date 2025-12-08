class Solution {
    public int uniquePathsWithObstacles(int[][] a) {
      int  m=a.length;
      int   n=a[0].length;
      int [][] dp=new int[m][n];
      dp[0][0]=1;
      if(a[0][0]==1 ||a[m-1][n-1]==1){
        return 0;
      }
      for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      

        if(a[i][j]==1){
            dp[i][j]=0;
            continue;
        }
         if (i > 0) dp[i][j] += dp[i - 1][j];
                if (j > 0) dp[i][j] += dp[i][j - 1];

    }
      }
      return dp[m-1][n-1];
    }
}