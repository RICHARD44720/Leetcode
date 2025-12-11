class Solution {
    public int climbStairs(int n) {

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
       return help(n,dp);
    }
    public int help(int i,int[] dp){
        if(i==0||i==1){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=help(i-1,dp)+help(i-2,dp);
        return dp[i];

    }
}