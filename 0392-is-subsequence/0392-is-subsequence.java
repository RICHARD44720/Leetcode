class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=0;
        int k=0;
        while(n<s.length() && k<t.length() ){
            if(s.charAt(n)==t.charAt(k)){
                n++;
            }
            k++;
        }
        return n==s.length();
    }
}