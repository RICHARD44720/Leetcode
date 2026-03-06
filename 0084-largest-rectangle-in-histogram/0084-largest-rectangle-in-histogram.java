class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length ;

        int[] stack = new int[n + 1] ;
        int top = -1 ;

        int res = 0 ;

        for(int i = 0 ; i <= n ; i ++)
        {
            while(top >= 0 && (i == n || heights[stack[top]] > heights[i]))
            {
                int height = heights[stack[top--]] ;

                int left = top < 0 ? -1 : stack[top] ;

                res = Math.max(res, height * (i - left - 1)) ;
            }

            stack[++ top] = i ;
        }

        return res ;
        
    }
}