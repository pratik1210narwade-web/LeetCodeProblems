class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for(int i : nums2){
            int m = i * k;
            for(int j : nums1){
                if((j % m) == 0){
                    count++;
                }
            }
        }
        return count;
    }
}