class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            int st=0;
            for(String w:wordDict){
                 st=i-w.length();
                if(st>=0 && dp[st] && s.substring(st,i).equals(w)){
                dp[i]=true;
                break;
            }}
        } 
        return dp[s.length()];
    }
}