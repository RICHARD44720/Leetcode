class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> map=new HashMap<>();
      int n=s.length();
      int m=t.length();
      for(int i=0;i<n;i++){
        char c=s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
      }
      for(int i=0;i<m;i++){
        char c=t.charAt(i);
        if(map.get(t.charAt(i))!=null){
            if(map.get(c)==1){
            map.remove(c);}
            else{
                map.put(c,map.get(c)-1);
            }
        }
        else{
            return false;
        }
      }
      return map.isEmpty();
}}