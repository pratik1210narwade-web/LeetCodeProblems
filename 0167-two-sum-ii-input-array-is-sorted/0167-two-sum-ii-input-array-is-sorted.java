class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        // for(int i = 0; i < numbers.length; i++){
        //     for(int j = i+1; j < numbers.length; j++){
        //         if(numbers[i] + numbers[j] == target){
        //             arr[0] = i + 1;
        //             arr[1] = j + 1;
        //         }
        //     }
        // }
        // return arr;
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            if(numbers[left] + numbers[right] == target){
                arr[0] = left + 1;
                arr[1] = right + 1;
                break;
            }
            else if(numbers[left] + numbers[right] > target){
                right--;
            }
            else{
                left++;
            }
        }
        return arr;
    }
}