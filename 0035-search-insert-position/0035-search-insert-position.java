class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int len=nums.length;
        if(nums[0]>target){
            i=0;
        }
        if(nums[len-1]<target){
            i=len;
        }
        if(nums[0]==target){
            i=0;
        }
        for(int j=1;j<len;j++){
            if(nums[j]==target){
                 i=j;
            }
            else if(nums[j-1]<target && nums[j]>target){
                 i=j;
            }
        }return i;
    }
}