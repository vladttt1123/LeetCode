package Easy.GroupB;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 *
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2. answer[1] is a list of all distinct integers in nums2 which are not present in nums1. Note that the integers in the lists may be returned in any order.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3], nums2 = [2,4,6] Output: [[1,3],[4,6]] Explanation: For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3]. For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
 */

public class FindtheDifferenceofTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> distinctInNums1 = new ArrayList<>();
        List<Integer> distinctInNums2 = new ArrayList<>();

        for (Integer elem : set1) {
            if (!set2.contains(elem)) {
                distinctInNums1.add((elem));
            }
        }

        for (Integer elem : set2) {
            if (!set1.contains(elem)) {
                distinctInNums2.add((elem));
            }
        }

        List<List<Integer>> finalList = new ArrayList<>();
        finalList.add(distinctInNums1);
        finalList.add(distinctInNums2);

        return finalList;
    }
}
