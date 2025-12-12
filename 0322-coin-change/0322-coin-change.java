class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int INF = amount + 1;
        
        
        int[][] dp = new int[n + 1][amount + 1];
        
       
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
            dp[i][0] =0;
        }
        
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j >= coins[i - 1]) {
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        return dp[n][amount] > amount ? -1 : dp[n][amount];
    }
}
