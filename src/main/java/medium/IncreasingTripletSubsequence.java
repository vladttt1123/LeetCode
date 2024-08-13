package medium;

/**
 * 334. Increasing Triplet Subsequence
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 * Example 1:
 * Input: nums = [1,2,3,4,5]
 * Output: true
 * Explanation: Any triplet where i < j < k is valid.
 */

public class IncreasingTripletSubsequence {

    public static void main(String[] args) {

        int[] arr = {2,1,5,0,4,6};
        System.out.println(increasingTriplet(arr));
    }


    public static boolean increasingTriplet(int[] nums) {

        if(nums == null || nums.length < 3){
            return  false;
        }
        int first = Integer.MAX_VALUE;//0
        int second = Integer.MAX_VALUE; //4
        //{2,1,5,0,4,6};
        for(int num : nums){
            if(num <= first){
                first = num;
            }
            else if(num <= second){
                second = num;
            }
            else{
                return true;
            }
        }
        return false;
    }

}
