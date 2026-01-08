class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        int numsIterator = 0;
        for(int i=0; i<nums.length; i+=2) {
            ans[i] = nums[numsIterator];
            ans[i+1] = nums[n+numsIterator];
            numsIterator++;
        }
        return ans;
    }
}