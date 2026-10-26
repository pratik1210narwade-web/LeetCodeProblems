class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); 
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        Set<Integer> set = new HashSet<>();
        int ind = 0;
        for(int i : nums){
            if(map.get(i) == 2){
                set.add(i);
            }
        }    
        List<Integer> list = new ArrayList<>(set);    
        return list;
    }
}