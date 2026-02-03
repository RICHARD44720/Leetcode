class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n=s.length();
        int c=0;
        int l=0;int r=n-1;
    while(r>l){
if(s.charAt(l)!=s.charAt(r)){
    c=1;
}
l++;
r--;
        }
        return c==0;
    }
}