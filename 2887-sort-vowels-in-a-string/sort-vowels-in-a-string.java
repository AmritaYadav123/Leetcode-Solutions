class Solution {
    public String sortVowels(String s) {
        HashMap<Character,Integer> map= new HashMap<>();

        for(char ch: s.toCharArray())
        {if(isVowel(ch))
        {map.put(ch,map.getOrDefault(ch,0)+1);}}

        String temp="AEIOUaeiou";
        int j=0;
        char ans[]= s.toCharArray();

        for(int i=0;i<ans.length;i++)
        {if(isVowel(ans[i]))
        {while(map.getOrDefault(temp.charAt(j),0)==0)
        {j++;}
        
        ans[i]= temp.charAt(j);
        map.put(temp.charAt(j),map.get(temp.charAt(j))-1);}
        }

        return new String(ans);
    }

    boolean isVowel(char ch)
    {return ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';}
}