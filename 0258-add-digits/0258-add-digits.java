class Solution {
    public int addDigits(int num) {
        int a=0;
        while(num>=10){
            a=num%10;
            num=num/10;
            num=a+num;
        }
        return num;
    }
}