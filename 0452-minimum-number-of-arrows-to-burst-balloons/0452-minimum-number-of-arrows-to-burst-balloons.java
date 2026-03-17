class Solution {
    public int findMinArrowShots(int[][] points) {
        int n=points.length;
        int count=1;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int t=points[0][1];
      
        for(int i=1;i<n;i++){
            if(t>=points[i][0] ){
                continue;
            }
            else{
                t=points[i][1];
              
                count++;
            }

        }
        return count;
        
       
    }
}