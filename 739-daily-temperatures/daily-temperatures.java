class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;
        int answer[]= new int[n];

        Stack<Integer> st= new Stack<>();
        for(int currTemp=0; currTemp<n;currTemp++)
        {
            while(!st.isEmpty() && temperatures[st.peek()]< temperatures[currTemp])
            {int prevDay=st.pop(); 
            answer[prevDay]= currTemp-prevDay;}
            st.push(currTemp);
        }
        return answer;
    }
}