class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return calculate(nums,dp,nums.length-1);
    }
    public int calculate(int[] nums, int[] dp, int index)
    {
        if(index==0)
            return nums[0];
        if(index==1)
            return Math.max(nums[0],nums[1]);
        if(dp[index]!=-1)
            return dp[index];
        int pick=nums[index]+calculate(nums,dp,index-2);
        int notpick=calculate(nums,dp,index-1);
        int ans=Math.max(pick,notpick);
        dp[index]=ans;
        return dp[index];
    }
}