package Easy.GroupB;

/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 *
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 * Example 1:
 *
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 */

public class MaxAverageSubarray {

    public static void main(String[] args) {
        int [] arr = {1,12,-5,-6,50,3};

        System.out.println(findMaxAverage(arr, 4));
    }


    public static double findMaxAverage(int[] nums, int k) {

        int arrLength = nums.length;

        if(arrLength == 1){
            return nums[0];
        }

        int initialSum = 0;
        for(int i = 0; i < k; i++){
            // getting the sum of the initial window
            initialSum = initialSum + nums[i];
        }

        //sliding techniquq
        int maxSum = initialSum;

        for(int i = k; i < arrLength; i++ ){

            initialSum = initialSum - nums[i - k] + nums [i];

            if(initialSum > maxSum){
                maxSum = initialSum;
            }
        }

        return (double) maxSum / k;
    }

}
