class Solution {
    public int residuePrefixes(String s) {
        int val=0;
        HashSet<Character>map=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
         map.add(s.charAt(i));
         int pre=(i+1)%3;
         int len=map.size();


         if(pre==len)
         {
            val++;
         }
        }
        return val;
    }
}