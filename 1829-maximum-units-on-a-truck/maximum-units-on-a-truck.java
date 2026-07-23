class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int n= boxTypes.length;

        Arrays.sort(boxTypes, (a,b)-> b[1]-a[1]);
        int currBoxes=0;
        int totalUnits=0;

        for(int i=0;i<n;i++)
        {if(currBoxes+boxTypes[i][0]<=truckSize)
        {currBoxes= currBoxes+boxTypes[i][0];
        totalUnits= totalUnits+(boxTypes[i][0]*boxTypes[i][1]);}
        
        else
        {int remainingSpace= truckSize-currBoxes;
        totalUnits= totalUnits+(remainingSpace*boxTypes[i][1]);
        break;}}

        return totalUnits;
    }
}