class Solution {
    public void moveZeroes(int[] nums) {

        ArrayList<Integer> arr=  new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {if(nums[i]!=0)
        {arr.add(nums[i]);}
        else
        count++;}

        for(int i=0;i<count;i++)
        {arr.add(0);}

        for(int i=0;i<nums.length;i++)
        {nums[i]= arr.get(i);}
    }
}