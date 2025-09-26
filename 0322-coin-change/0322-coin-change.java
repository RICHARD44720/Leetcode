class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;int c=0;
       
        for(int num:coins){
            for(int j=1;j<=amount;j++){
                
                if(j>=num)
                dp[j]=Math.min(dp[j-num]+1,dp[j]);
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}