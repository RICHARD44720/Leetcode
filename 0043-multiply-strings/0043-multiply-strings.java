import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) return "0";

        BigInteger a =new BigInteger(num1);
        BigInteger b =new BigInteger(num2);

        BigInteger product = a.multiply(b);

        return String.valueOf(product);
    }
}
