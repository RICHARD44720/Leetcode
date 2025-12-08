class Solution {
    static int[]dp=new int[46];
    public int climbStairs(int n) {
       for(int i=1;i<=n;i++){
            if(i==1 || i==2){
                dp[i]=i;
                
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
}