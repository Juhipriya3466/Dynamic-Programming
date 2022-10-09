class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return count(dp,n);
    }
    public int count(int[] dp,int n)
    {
        if(n<=2)
            return n;
        if(dp[n]!=-1)
            return dp[n];
        int ans=n;
        for(int i=1;i<=Math.sqrt(n);i++)
            ans=Math.min(ans,1+count(dp,n-(i*i)));
        dp[n]=ans;
        return ans;
            
    }
}