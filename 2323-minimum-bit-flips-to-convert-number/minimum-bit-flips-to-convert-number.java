class Solution {
    public int minBitFlips(int start, int goal) {
        int XOR= start^goal;
        int count= 0;

        while(XOR>0)
        {int digit= XOR%2;
        count+= digit;
        XOR= XOR/2;}

        return count;
    }
}