class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int countMoves = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != max){
                if((max - nums[i]) > 0){
                    countMoves = countMoves + (max - nums[i]);
                }
            }
            else{
                countMoves += 0;
            }
        }
        return countMoves;
    }
}