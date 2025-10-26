class Solution {
    public String countAndSay(int n) {
       
        String num = "1";

       
        for (int i = 1; i < n; i++) {
            StringBuilder str = new StringBuilder();
            char[] ch = num.toCharArray();
            char prev = ch[0];
            int count = 0;
            
           
            for (char c: ch) {
                if (prev == c) count++;
                else {
                    str.append(count).append(prev);
                    count = 1;
                    prev = c;
                }
            }
            str.append(count).append(prev);
            num = str.toString();
        }

        return num;
    }
}