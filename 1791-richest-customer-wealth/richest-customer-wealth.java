class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum= 0;
        int row= accounts.length;
        int col= accounts[0].length;

        for(int i=0;i<row;i++)
        {int sum= 0;
        for(int j=0;j<col;j++)
        {sum= sum+accounts[i][j];}

        maxSum= Math.max(sum,maxSum);}
        return maxSum;
    }
}