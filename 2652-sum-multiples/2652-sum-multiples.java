class Solution {
    public int sumOfMultiples(int n) {
        int[] dp=new int[n+1];
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                dp[i]=i;
            }
        }
        for(int i=1;i<=n;i++){
            sum=sum+dp[i];
        }return sum;
    }
}