class Solution {
    public int mySqrt(int x) {
        // Edge case: square root of 0 is 0
        if (x == 0) return 0;

        int left = 1, right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid; 
            } else if (square < x) {
                ans = mid; 
                left = mid + 1; 
            } else {
                right = mid - 1;
            }
        }

        return ans; 
    }
}