class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i , 0)+1);
        }
        int MapSize = map.size();
        Set<Integer> set = new HashSet<>(map.values());
        if(MapSize != set.size()){
            return false;
        }
        return true;
    }
}