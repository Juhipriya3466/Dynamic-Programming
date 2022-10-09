class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return increasingSubsequence(nums,dp);
    }
    public int increasingSubsequence(int[] nums,int[] dp)
    {
      for(int i=0;i<nums.length;i++)
      {
          int ans=1;
          for(int j=0;j<i;j++)
          {
              if(nums[j]<nums[i])
                  ans=Math.max(ans,1+dp[j]);
          }
          dp[i]=ans;
      }
        int LIS=0;
        for(int i=0;i<dp.length;i++)
            LIS=Math.max(LIS,dp[i]);
        return LIS;
    }
}