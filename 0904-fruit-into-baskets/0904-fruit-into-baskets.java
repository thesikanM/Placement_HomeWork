class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int max=0;
        Map<Integer,Integer>count=new HashMap<>();
        for(int i=0;i<fruits.length;i++)
        {
            count.put(fruits[i],count.getOrDefault(fruits[i],0)+1);
            while(count.size()>2)
            {
                count.put(fruits[left],count.get(fruits[left])-1);
                if(count.get(fruits[left])==0)
                {
                    count.remove(fruits[left]);
                }
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}