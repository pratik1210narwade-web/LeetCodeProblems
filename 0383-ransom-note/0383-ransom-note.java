class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        for(char C: ransomNote.toCharArray()){
            map.put(C, map.getOrDefault(C, 0)+1);
        }
        for(char C: magazine.toCharArray()){
            map1.put(C, map1.getOrDefault(C, 0)+1);
        }
        int count = 0;
        for(char C: ransomNote.toCharArray()){
            if(magazine.contains(C + "")){
                if(map1.get(C) >= map.get(C)){
                    count++;
                }
            }
        }
        if(count == ransomNote.length()){
            return true;
        }
        return false;
    }
}