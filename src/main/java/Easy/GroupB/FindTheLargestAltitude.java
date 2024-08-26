package Easy.GroupB;

public class FindTheLargestAltitude {

    public int largestAltitude(int[] gain) {

        int largest = 0;
        int currentNum = 0;

        for (int i = 0; i < gain.length; i++) {

            currentNum = currentNum + gain[i];

            if (currentNum > largest) {
                largest = currentNum;
            }
        }
        return largest;
    }
}
