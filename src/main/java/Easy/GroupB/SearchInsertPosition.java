package Easy.GroupB;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 */

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int pivot = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) {
                return pivot;
            }

            if (target < nums[pivot]) {
                right = pivot - 1;
            }
            else {
                left = pivot + 1;
            }
        }
        return left;


    }
}
