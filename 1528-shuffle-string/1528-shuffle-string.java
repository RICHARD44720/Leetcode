class Solution {
    public String restoreString(String s, int[] indices) {
        int len=s.length();
        StringBuilder sb=new StringBuilder("");
        char[] a=new char[len];
        for(int i=0;i<len;i++){
            a[indices[i]]=s.charAt(i);}
            sb.append(a);

        
        return sb.toString();
    }
}