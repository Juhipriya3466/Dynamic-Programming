class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return countWays(dp,n);
    }
    public int countWays(int[] dp,int n)
    {
        if(n==0)
            return 1;
        if(n<=2)
            return n;
        if(dp[n]!=-1)
            return dp[n];
        int ans=countWays(dp,n-1)+countWays(dp,n-2);
        dp[n]=ans;
        return ans;
    }
}