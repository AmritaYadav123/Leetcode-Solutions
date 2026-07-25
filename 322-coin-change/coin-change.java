class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0)
        {return 0;}

        int dp[]= new int[amount+1];
        dp[0]=0;

        for(int i=1;i<=amount;i++)
        {dp[i]=Integer.MAX_VALUE;}

        for(int currAmount=1;currAmount<=amount;currAmount++)
        {for(int j=0;j<coins.length;j++)
        {int coin= coins[j];
        if(coin<=currAmount)
        {if(dp[currAmount-coin]!=Integer.MAX_VALUE)
        {int ans= dp[currAmount-coin]+1;
        
        if(ans<=dp[currAmount])
        {dp[currAmount]=ans;}}}}}

        if(dp[amount]==Integer.MAX_VALUE)
        {return -1;}

        return dp[amount];
    }
}