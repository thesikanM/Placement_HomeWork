class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>result=new ArrayList<>();
        if(s.length()<p.length())
        {
            return result;
        }
        int pcharcount[] = new int[26];
        int scharcount[] = new int[26];

        for(char c:p.toCharArray())
        {
            pcharcount[c-'a']++;
        }
        int k=p.length();
           for(int i=0;i<s.length();i++)
           {
            scharcount[s.charAt(i)-'a']++;
           
           if(k<=i)
           {
            scharcount[s.charAt(i-k)-'a']--;
           }  
           if(Arrays.equals(pcharcount,scharcount))
           {
            result.add(i-k+1);
           }
           }
           return result;
    }
}