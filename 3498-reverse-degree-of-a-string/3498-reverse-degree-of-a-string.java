class Solution {
    public int reverseDegree(String s) {
        int degree =0;
    for(int i =0;i<s.length();i++)
    {
        int ind ='z'-s.charAt(i)+1;
        degree+=(i+1)*ind;
    } 
      return degree;

    }
}