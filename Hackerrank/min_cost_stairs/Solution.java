class Solution {
    public int[] memo;
    public int minCostClimbingStairs(int[] cost) {
        memo = new int[cost.length+1];
        int n = cost.length;
        memo[0] = 0;
        memo[1] = 0;
        for (int i = 2; i<n+1;i++) {
            memo[i] = Math.min(cost[n-i]+memo[i-1],cost[n-i+1] + memo[i-2]);
        }
        return memo[n];
    }
}