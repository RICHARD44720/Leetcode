class Solution {
    public boolean isPalindrome(int x) {
        int n=0;
        int m=x;
        while(x>0){
            int f=x%10;
            n=n*10+f;
            x=x/10;
        }
        
        return n==m;
        
    }
}