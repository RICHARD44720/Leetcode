class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      int n=words.length;
      int count =0;
      
      for(int i=0;i<n;i++){
        String word=words[i];
      boolean a=true;
      for(int j=0;j<word.length();j++){
char c=word.charAt(j);
if(allowed.indexOf(c)==-1){
    a=false;
  
}
      }
      if(a==true){
        count++;
      }}
      return count;
    }
}