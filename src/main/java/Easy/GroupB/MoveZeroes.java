package Easy.GroupB;

import java.util.Arrays;

/**
 * 283. Move Zeroes Easy Topics Companies Hint Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array. Example 1:
 *
 * Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0] Example 2:
 *
 * Input: nums = [0] Output: [0]
 */
public class MoveZeroes {

    public static void main(String[] args) {

        int[] numbers = {0, 0, 0, 0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveZeroes(numbers)));
    }

    public static int[] moveZeroes(int[] nums) {

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            // if it's zero do nothing, if it is non zero nove it to the position where the first occurence of zero took place
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        for (int i = nonZeroIndex; i < nums.length; i++) {

            nums[i] = 0;
        }

        return nums;
    }
}
