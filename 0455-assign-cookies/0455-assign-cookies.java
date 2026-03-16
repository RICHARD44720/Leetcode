class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int j=0;
        int i=0;
        int k=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && k<s.length){
            if(g[i]<=s[k]){
                j++;
            i++;
            }
            
                k++;
        
        }
        return j;
    }
}