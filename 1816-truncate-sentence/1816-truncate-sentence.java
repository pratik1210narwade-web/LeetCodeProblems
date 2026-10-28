class Solution {
    public String truncateSentence(String s, int k) {
        List<String> list = List.of(s.split(" "));
        String result = "";
        for(int i = 0; i < k; i++){
            result += (list.get(i) + " ");
        }
        return result.trim();
    }
}