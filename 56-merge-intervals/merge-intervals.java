class Solution {
    public int[][] merge(int[][] intervals) {
        
        int n= intervals.length;
        if(n<=1)
        {return intervals;}

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList <int []> answer= new ArrayList<>();

        int current[]= intervals[0];
        answer.add(current);

        for(int i=1;i<n;i++)
        {
            int next[]=intervals[i];
            if(next[0]<=current[1])
            {current[1]=Math.max(current[1],next[1]);}

            else
            {current=next;
            answer.add(current);}
        }
        return answer.toArray(new int[answer.size()][]);
    }
}