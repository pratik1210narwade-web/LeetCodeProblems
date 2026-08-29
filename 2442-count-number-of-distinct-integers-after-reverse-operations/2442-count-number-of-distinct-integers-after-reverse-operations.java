class Solution {
    public int countDistinctIntegers(int[] nums){
        int n = nums.length;
        int[] result = new int[n+n];
        int finalCount = 0;
        for(int i = 0; i < n; i++){
            result[i] = nums[i];
        }
        for(int i = 0; i < n; i++){
            int r = 0;
            int re = 0;
            while(nums[i]!=0){
                int j = nums[i]%10;
                re = re * 10 + j;
                nums[i] = nums[i]/10;
            }
            result[n+i] = re;
        }
        Set<Integer> set = new HashSet<>();
        for(int i : result){
            set.add(i);
        }
        return set.size();
    }
}
