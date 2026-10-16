class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(String i : words1){
            map1.put(i, map1.getOrDefault(i, 0)+1);
        }
        for(String i : words2){
            map2.put(i, map2.getOrDefault(i, 0)+1);
        }
        int count = 0;
        for(String word : words1)
            if(map1.get(word) == 1 && map2.getOrDefault(word,0) == 1)
                count++;
        return count;

    }
}