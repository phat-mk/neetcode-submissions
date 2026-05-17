class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        int pre2 = 0;
        int pre1 = 0;

        for (int i = 2; i <= n; i++) {
            int current = Math.min(pre2 + cost[i-2], pre1 + cost[i-1]);
            pre2 = pre1;
            pre1 = current;
        }
        return pre1;
    }
}