class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : sentence.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        if(map.size() == 26){
            return true;
        }
        return false;
    }
}