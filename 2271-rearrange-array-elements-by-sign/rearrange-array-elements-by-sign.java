class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int res[]= new int[n];
        int Ppos= 0;
        int Npos= 1;

        for(int i=0;i<n;i++)
        {if(nums[i]>0)
        {res[Ppos]= nums[i];
        Ppos+=2;}
        
        else if(nums[i]<0)
        {res[Npos]=nums[i];
        Npos+=2;}}

        return res;
    }
}