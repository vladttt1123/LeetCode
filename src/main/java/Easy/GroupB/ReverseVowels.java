package Easy.GroupB;

/**
 345. Reverse Vowels of a String
 Given a string s, reverse only all the vowels in the string and return it.

 The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 Example 1:

 Input: s = "hello"

 h e l l o

 // transform to char array
 // save string length in a variable
 // declare starting index and index of last elem
 STEPS:
 // loop till start < end
 // check if the first elem in array is vowel, if it's not increment start
 // check if the last element in array is vowel, if it's not decrement
 //else means both had vowels, then we neeed to perform a swap operation
 //increment start and decrement the end
 Output: "holle"

 */

public class ReverseVowels {

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseVowels(str));
    }

    public static String reverseVowels(String s) {

        int strLength = s.length();
        char [] charArray = s.toCharArray();

        int left = 0;
        int right = strLength -1;

        while(left < right){

            if (!isVowel(charArray[left])){
                left ++;
            }
            else if(!isVowel(charArray[right])){
                right --;
            }
            else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left ++;
                right --;
            }
        }
        return String.valueOf(charArray);

    }


    public static boolean isVowel(char ch){

        if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return  true;
        }
        else {
            return  false;
        }
    }

}
