class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i: nums1) set.add(i);
        for(int i: nums2) set1.add(i);
        for(int i: set){
            if(set1.contains(i)){
                list.add(i);
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}