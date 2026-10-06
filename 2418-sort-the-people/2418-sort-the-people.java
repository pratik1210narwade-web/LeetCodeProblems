class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        TreeMap<Integer, String> map = new TreeMap<>();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            map.put(heights[i], names[i]);
        }
        int i = 0;
        TreeMap<Integer, String> map1 = new TreeMap<>(map.descendingMap());
        for(String name : map1.values()){
            arr[i] = name;
            i++;
        }
        return arr;
    }
}