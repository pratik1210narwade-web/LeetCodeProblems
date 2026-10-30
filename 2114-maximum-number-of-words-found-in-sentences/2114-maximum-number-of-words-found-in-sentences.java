class Solution {
    public int mostWordsFound(String[] sentences) {
        int i = 0;
        int result = 0;
        while(i < sentences.length){
            List<String> list = Arrays.asList(sentences[i].split(" "));
            if(list.size() > result){
                result = list.size();
            }
            i++;
        }
        return result;
    }
}