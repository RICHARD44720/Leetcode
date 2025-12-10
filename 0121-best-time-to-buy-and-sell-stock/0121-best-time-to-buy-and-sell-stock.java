class Solution {
    public int maxProfit(int[] prices) {
        int a=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<a){
                a=prices[i];
            }
            else if(prices[i]-a>profit){
                    profit=prices[i]-a;
                
            }
        }return profit;
    }
}