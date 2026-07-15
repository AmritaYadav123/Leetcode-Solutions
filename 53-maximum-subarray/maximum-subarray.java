class Solution {
    class Result
    {
        int low;
        int high;
        int sum;

        Result(int low,int high,int sum)
        {this.low=low;
        this.high=high;
        this.sum=sum;}
    }
    public int maxSubArray(int[] nums) {
        Result ans= FMS(nums,0,nums.length-1);
        return ans.sum;
    }

    public Result FMS(int A[], int low,int high)
    {if(high==low)
    {return new Result(low,high,A[low]);}
    else
    {int mid=(low+high)/2;
    
    Result left=FMS(A,low,mid);
    Result right= FMS(A,mid+1,high);
    Result cross= FM_cross(A,low,mid,high);
    
    if(left.sum>=right.sum && left.sum>=cross.sum)
    {return left;}
    else if(right.sum>=left.sum && right.sum>=cross.sum)
    {return right;}
    else
    {return cross;}}}

    public Result FM_cross(int A[],int low, int mid, int high)
    {
        int leftSum= Integer.MIN_VALUE;
        int sum=0;
        int maxLeft=mid;

        for(int i=mid;i>=low;i--)
        {sum=sum+A[i];
        if(sum>=leftSum)
        {leftSum=sum;
        maxLeft=i;}}

        int rightSum= Integer.MIN_VALUE;
        sum=0;
        int maxRight= mid+1;

        for(int j=mid+1;j<=high;j++)
        {sum=sum+A[j];
        
        if(sum>rightSum)
        {rightSum=sum;
        maxRight=j;}}

        return new Result(maxLeft,maxRight,leftSum+rightSum);
    }
}