package Easy.GroupB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1431. Kids With the Greatest Number of Candies
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 *
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 *
 * Note that multiple kids can have the greatest number of candies.
 */

public class KidsWithCandies {

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies)); // [true, true, true, false, true]
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //candies = [2,3,5,1,3],
        // iterate over array of candies and  the max value and save it into a variable
        int maxCandies = 0;
        for(int candy : candies){
            // gets the largest number from an array
            maxCandies = Math.max(maxCandies, candy);
        }

        List<Boolean> resultList = new ArrayList<Boolean>();
        //  if current candies number + extra candies number is greater or equal

        for(int candy : candies){
            resultList.add(candy + extraCandies >= maxCandies);
        }

        return resultList;

    }

//     Stream API Solution
//    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        //candies = [2,3,5,1,3],
//        // iterate over array of candies and  the max value and save it into a variable
//
//        int largest = Arrays.stream(candies).max().getAsInt();
//
//        return Arrays.stream(cand`ies).mapToObj(candy -> candy + extraCa`ndies >= largest).collect(Collectors.toList());
//
//    }

}
