class Solution {
    public void rotate(int[][] ar) {
        int n=ar.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int temp=ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=ar[i][j];
                ar[i][j]=ar[i][n-1-j];
                ar[i][n-1-j]=temp;
            }
        }
    }
}