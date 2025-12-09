class Solution {
    public int maximum69Number (int num) {
        
        StringBuilder a = new StringBuilder(String.valueOf(num));

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '6'){
                a.setCharAt(i, '9');   
                break;
            }
        }

        return Integer.parseInt(a.toString());
    }
}
