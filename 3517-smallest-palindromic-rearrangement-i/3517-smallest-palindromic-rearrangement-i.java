class Solution {
    public String smallestPalindrome(String s) {

        StringBuilder left = new StringBuilder();
        String mid = "";
        int freq[] = new int[26];
        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(freq[i] % 2 == 1) {
                mid = String.valueOf((char)('a' + i));
            }
            for(int j = 0; j < freq[i] / 2; j++) {
                left.append((char)('a' + i));
            }
        }
        String ans = left.toString() + mid + left.reverse().toString();
        return ans;
    }
}