class Solution {
    public int maxRepeating(String sequence, String word) {
        int a=1;
        int c=0;
        String d=word;
        while(a==1){
            if(sequence.contains(word)){
                c++;
                word=word+d;
            }
            else{
                a=2;
            }
        }return c;
    }
}