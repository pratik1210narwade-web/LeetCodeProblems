import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j]==target){
                   result[0] = i;
                   result[1] = j;
                }
            }
        }
        return result;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Solution s = new Solution();
        int[] result = s.twoSum(nums ,target);
        System.out.println(result);
    }
}