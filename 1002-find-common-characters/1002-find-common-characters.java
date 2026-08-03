/*class Solution {
    public List<String> commonChars(String[] words) {
         ArrayList<String>list =new ArrayList<>();
         String first =words[0];
         for(char ch:first.toCharArray())
         {
            boolean commen =true;
            for(int i=1;i<words.length;i++)
            {
                int ind =words[i].indexOf(ch);

                if(ind == -1)
                {
                    commen =false;
                    break;
                }
                //words[i]=words[i].substring(1,ind)+words[i].substring(ind+1);
                words[i]=words[i].substring(1, ind) + words[i].substring(ind + 1);
            }
            if(commen)
            {
                list.add(String.valueOf(ch));
            }
           
         }
          return list;
    }
}*/
class Solution {
    public List<String> commonChars(String[] words) {

        List<String> list = new ArrayList<>();

        String first = words[0];

        for (char ch : first.toCharArray()) {

            boolean common = true;

            for (int i = 1; i < words.length; i++) {

                int ind = words[i].indexOf(ch);

                if (ind == -1) {
                    common = false;
                    break;
                }

                words[i] = words[i].substring(0, ind)
                         + words[i].substring(ind + 1);
            }

            if (common) {
                list.add(String.valueOf(ch));
            }
        }

        return list;
    }
}