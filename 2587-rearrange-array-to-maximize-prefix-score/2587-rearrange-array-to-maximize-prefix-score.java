class Solution {
    public int maxScore(int[] nums) {
      Arrays.sort(nums);
      int max=0;
      int n=nums.length;
      long sum = 0;

for(int i = nums.length - 1; i >= 0; i--) {
    sum += nums[i];

    if(sum > 0) max++;
    else break;

    

      }return max;
    }
}