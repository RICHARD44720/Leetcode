class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1) {
            if (seen.contains(n)) return false;
            seen.add(n);
            int res = 0;
            while (n > 0) {
                int rem = n % 10;
                res += rem * rem;
                n /= 10;
            }
            n = res;
        }
        return true;
    }
}