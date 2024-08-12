package medium;

/**
 * 238. Product of Array Except Self
 * Medium
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 */


public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums = {7, 2, 3, 4};
        System.out.println(productExceptSelf(nums));

    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] result = new int[n];

        // Fill the leftProduct array
        leftProduct[0] = 1;  // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }

        // Fill the rightProduct array
        rightProduct[n - 1] = 1;  // No elements to the right of the last element
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }

        // Fill the result array
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }

        return result;

    }

}
