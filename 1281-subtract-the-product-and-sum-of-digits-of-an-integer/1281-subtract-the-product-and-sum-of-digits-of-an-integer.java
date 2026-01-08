class Solution {
    public int subtractProductAndSum(int n) {
        int a=0;int b=1;
        while(n>0){
            a=a+(n%10);
            b=b*(n%10);
            n=n/10;
        }
        System.out.print(a);
        return b-a;
    }
}