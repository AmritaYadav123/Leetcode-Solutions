class Solution {
    public int minSetSize(int[] arr) {
        int n= arr.length;

        HashMap<Integer, Integer> map= new HashMap<>();
        for(int num:arr)
        {map.put(num, map.getOrDefault(num,0)+1);}

        ArrayList<Integer> freq= new ArrayList<>(map.values());
        Collections.sort(freq,Collections.reverseOrder());

        int count=0;
        int totalElements= n;

        for(int i=0;i<freq.size();i++)
        {if(totalElements>n/2)
        {totalElements= totalElements-freq.get(i);
        count++;}}

        return count;
    }
}