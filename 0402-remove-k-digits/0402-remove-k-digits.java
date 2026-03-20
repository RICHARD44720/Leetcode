class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        if(num.equals("9")){
            return "0";
        }
        for(char c : num.toCharArray()) {
            while(sb.length() > 0 && k > 0 && sb.charAt(sb.length()-1) > c) {
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            sb.append(c);
        }
         
       while(k > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length()-1);
            k--;
        }
         while(sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);}
return sb.length() == 0 ? "0" : sb.toString();
    }
}
    