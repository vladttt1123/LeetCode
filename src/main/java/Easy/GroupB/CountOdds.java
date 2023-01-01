package Easy.GroupB;

/**
 * Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
 * Example 1:
 *
 * Input: low = 3, high = 7
 * Output: 3
 * Explanation: The odd numbers between 3 and 7 are [3,5,7].
 */

public class CountOdds {
    public int countOdds(int low, int high) {
        if(low % 2 == 0){
            low++;
        }

        if(low > high ){
            return 0;
        }
        else{
            int result =  (high - low) / 2 + 1;
            return result;
        }
    }
}
