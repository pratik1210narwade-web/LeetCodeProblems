class Solution {
    public String reverseVowels(String s) {
        String vowels = "AEIOUaeiou";
        String vIns = "";
        for(char ch : s.toCharArray()){
            if(vowels.contains(String.valueOf(ch))){
                vIns += String.valueOf(ch);
            }
        }
        String Str = "";
        int ind = 0;
        String rString = new StringBuilder(vIns).reverse().toString();
        for(char ch : s.toCharArray()) {
            if(vowels.contains(String.valueOf(ch))){
                Str += rString.charAt(ind);
                ind++;
            }else {
                Str += ch;
            }
        }
        return Str;
    }
}