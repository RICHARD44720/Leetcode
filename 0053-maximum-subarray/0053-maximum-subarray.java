class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0;
        int sum=nums[0];
        for(int n:nums){
            cur=Math.max(n,n+cur);
            sum=Math.max(sum,cur);
            }return sum; }}