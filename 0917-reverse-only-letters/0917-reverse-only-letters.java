class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[]=s.toCharArray();
        int left =0;
        int right =ch.length-1;
        while(left<right)
        {
            if(Character.isLetter(ch[left]) && Character.isLetter(ch[right]))
            {
                char temp =ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
            else if(!Character.isLetter(ch[left]))
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return  String.valueOf(ch);
    }
}