class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int c=right-left;
             max=Math.max(max,c*h);
        
        if(height[left]<height[right]){
left++;
        }
        else{
            right--;
        }}
        return max;
    }
}