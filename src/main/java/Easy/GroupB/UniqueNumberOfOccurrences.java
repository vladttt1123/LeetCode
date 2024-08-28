package Easy.GroupB;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1, 1, 3};
        uniqueOccurrences(arr);
    }

    public static boolean uniqueOccurrences(int[] arr) {
        // * Input: arr = [1,2,2,1,1,3]
        //iterate over the array
        //count the occurence of each distinct integer , could use HashMap
        //save the result into List , get the length of the list
        //save the result from HanMap into set, get Set length
        //compare the length of the set and of the list, if length is the same return true else false

        // Create a HashMap to store occurrences
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num : arr) {

            if (occurrences.containsKey(num)) {
                occurrences.put(num, occurrences.get(num) + 1);
            } else {
                occurrences.put(num, 1);
            }
        }

        List<Integer> numberOfOccurences = new LinkedList<>();

        for (Map.Entry<Integer, Integer> elememt : occurrences.entrySet()) {
            numberOfOccurences.add(elememt.getValue());
        }

        int initialListSize = numberOfOccurences.size();

        Set<Integer> uniqueValue = new HashSet<>();

        for (Map.Entry<Integer, Integer> elememt : occurrences.entrySet()) {
            uniqueValue.add(elememt.getValue());
        }

        int finalSize = uniqueValue.size();

        if (initialListSize == finalSize) {
            return true;
        } else {
            return false;
        }
    }

}
