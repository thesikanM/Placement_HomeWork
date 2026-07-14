class Solution {
    public int vowelConsonantScore(String s) {
        int score =0;
        int vowel=0;
        int cons =0;
        String vow ="aeiou";
    
        for(int i=0;i<s.length();i++)
        {

            char ch =s.charAt(i);
            if(ch>='a' && ch<='z')
            {
            if(vow.indexOf(ch) !=-1)
            {
                vowel++;
            }
            else
            {
                cons++;
            }
        }
        }
        if(cons==0)
        {
            return 0;
        }
        score = vowel/cons;
        return score; 
    }
}