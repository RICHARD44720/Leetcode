class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length, max = 0, left = 0;
        while (left < n - 2) {
            // up-slope
            while (left < n - 1 && arr[left] >= arr[left + 1]) left++;
            int up = left;
            while (up < n - 1 && arr[up] < arr[up + 1]) up++;
            int down = up;
            while (down < n - 1 && arr[down] > arr[down + 1]) down++;
            if (up != left && down != up) // valid mountain
                max = Math.max(max, down - left + 1);
            left = Math.max(down, left + 1);
        }
        return max;
    }
}