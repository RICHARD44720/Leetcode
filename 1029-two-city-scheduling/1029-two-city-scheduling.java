import java.util.*;

class Solution {
    public int twoCitySchedCost(int[][] costs) {

        
        Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));

        int n = costs.length / 2;
        int total = 0;
for(int i=0;i<n;i++)
        {
            total += costs[i][0];
        }

        
        for (int i = n; i < costs.length; i++) {
            total += costs[i][1];
        }

        return total;
    }
}