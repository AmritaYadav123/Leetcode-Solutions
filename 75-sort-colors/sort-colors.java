class Solution {
    public void sortColors(int[] nums) {
        int position=0;
        int ones=0;

        for(int i=0;i<nums.length;i++)
        {if(nums[i]==1)
        {ones++;}
        
        if(nums[i]!=1 && nums[i]!=2)
        {nums[position]=0;
        position++;}}

        while(position<nums.length)
        {if(ones!=0)
        {nums[position++]=1;
        ones--;}
        else
        {nums[position++]=2;}}
    }
}