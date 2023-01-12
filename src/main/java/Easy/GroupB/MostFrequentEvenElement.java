package Easy.GroupB;

public class MostFrequentEvenElement {
    //BITWISE Implmentation
    // we will use XOR , because
    // A ^ A = 0;
    // 1. The number is transformed to binary
    // 2. All ones are changed to zero and as a result the number becomes 0
    public int mostFrequentEven(int[] nums){
        int xorArr = 0;
        for(int i : nums){
            xorArr^=i;
        }

        int xorAll = 0;
        for(int j : nums){
            xorAll^=j;
        }
        return xorAll ^ xorArr;

    }


//    // cycle Implementation
//    public int mostFrequentEven(int[] nums) {
//        //inittilazing  sumArray variable
//        int sumArray = 0;
//
//        // iterating over array an calculate sum of all elements
//        for (int num : nums) {
//            sumArray = sumArray + num;
//        }
//
//        //storing array length in n variable
//        int n = nums.length;
//
//        // formula that calculates
//        // sum of all numbers from 1 to N
//        int sumAll = n*(n + 1) / 2;
//
//        //the missing number is the substraction of sumAll and sum of the Array
//        return sumAll - sumArray;
//
//    }

}
