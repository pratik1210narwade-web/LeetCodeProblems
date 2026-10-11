class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i  = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));

        String str = "";
        for(char c: list){
            int count = map.get(c);
            for(int i = 0; i < count; i++){
                str = str + c;  
            }            
        }
        return str;
    }
}