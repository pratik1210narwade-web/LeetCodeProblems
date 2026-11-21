class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
    String[] allWords = (s1 + " " + s2).split(" ");    
    Map<String, Integer> map = new HashMap<>();
    for(String str : allWords){
        map.put(str, map.getOrDefault(str, 0)+1);
    }
    List<String> list = new ArrayList<>();
    for(Map.Entry<String, Integer> entry : map.entrySet()){
        if(entry.getValue().equals(1)){
            list.add(entry.getKey());
        }
    }
    String[] arr = new String[list.size()];
    for(int i = 0; i < list.size(); i++){
        arr[i] = list.get(i);
    }
    return arr;
    }
}