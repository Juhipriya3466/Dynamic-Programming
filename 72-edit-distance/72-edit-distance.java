class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()][word2.length()];
        for(int[] arr: dp)
        Arrays.fill(arr,-1);
        return edit(word1,word2,word1.length()-1,word2.length()-1,dp);
    }
    public int edit(String A,String B,int i, int j,int[][] dp)
    {
        if(i<0 && j<0)
        return 0;
        if(i<0)
        return j+1;
        if(j<0)
        return i+1;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int ans=-1;
        if(A.charAt(i)==B.charAt(j))
        return dp[i][j]=edit(A,B,i-1,j-1,dp);
        else
        return dp[i][j]=Math.min(edit(A,B,i-1,j-1,dp),Math.min(edit(A,B,i-1,j,dp),edit(A,B,i,j-1,dp)))+1;
    }
}