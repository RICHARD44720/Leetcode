class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0;
        int sum=nums[0];
        for(int n:nums){
            cur+=n;
            sum=Math.max(sum,cur);
            if(cur<0){
                cur=0;
            }}return sum;}}