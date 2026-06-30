class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
       // int left=0;
        int max=Integer.MAX_VALUE;;
        //List<Integer>list=new ArrayList<>();
       int n=nums.size();
        for(int i=0;i<n;i++)
        {
           int sum=0;
            for(int j=i;j<n;j++)
            {
               sum+=nums.get(j); //3
               int len =j-i+1; 
               if(len<=r && len>=l && sum>0)
               {
                max=Math.min(max,sum);
               }
            }

        }
      if(max==Integer.MAX_VALUE)
      {
        return -1;
      }
      else
      {
        return max;
      }

    }
}