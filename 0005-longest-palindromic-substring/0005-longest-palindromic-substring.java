class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
            boolean[][] dp=new boolean[n][n];
            int end=0;
            int start=0;
            for(int pal=0;pal<n;pal++){
                for(int st=0,en=pal;st<n-pal &&  en<n;st++,en++){
                    if(pal==0){
                        dp[st][en]=true;
                    }
                    else if(pal==1||pal==2){
                        if(s.charAt(st)==s.charAt(en)){
                            dp[st][en]=true;
                        }
                    }
                    else{
                        if(s.charAt(st)==s.charAt(en) &&dp[st+1][en-1] ){
                            dp[st][en]=true;
                        }
                    }
                    if(dp[st][en] && en-st>end-start){
                        start=st;
                        end=en;
                    }
                    
                }
            }
            return s.substring(start,end+1);
    }
}