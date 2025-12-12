class Solution {
    public String defangIPaddr(String address) {
        String ip=address.replace(".","[.]");
        return ip;
    }
}