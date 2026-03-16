class Solution {
    public int maxProfit(int[] prices) {
       int a[]=new int[prices.length];
        int total=0;
        for(int i=1;i<prices.length;i++){
            a[i]=prices[i]-prices[i-1];

        }
        for(int i=1;i<prices.length;i++){
            if(a[i]>0)
            total+=a[i];
        }
        return total;
    }
}