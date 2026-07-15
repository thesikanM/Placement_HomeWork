class Solution {
    public String reverseByType(String s) {
        List<Character> letter = new ArrayList<>();
        List<Character> spl = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                letter.add(ch);
            } else {
                spl.add(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        int letterind = letter.size() - 1;
        int splind = spl.size() - 1;   

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                sb.append(letter.get(letterind));
                letterind--;
            } else {
                sb.append(spl.get(splind));
                splind--;
            }
        }
        return sb.toString();
    }
}