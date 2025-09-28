class Solution {
    public int change(int amount, int[] coins) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,0);
        dp[0]=1;int c=0;
       
        for(int num:coins){
           for (int j=1;j<=amount;j++){
                if(j>=num)
                
                dp[j]=dp[j]+dp[j-num];
                

            }
        }
        return dp[amount];
    }
}