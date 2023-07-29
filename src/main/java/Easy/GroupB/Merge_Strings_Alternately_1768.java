package Easy.GroupB;

public class Merge_Strings_Alternately_1768 {

    public String mergeAlternately(String word1, String word2) {

        // calculate length of the each word
        int length1 = word1.length();
        int length2 = word2.length();

        //find the word with least number of characters
        int min = Math.min(length1, length2);

        //define an empty String variable that will hold the longer String
        String longerString = "";

        //store longer of 2 String in the variable
        if(min == length1){
            longerString = word2;
        }
        if(min == length2){
            longerString = word1;
        }

        char chars1[] = word1.toCharArray();
        char chars2[] = word2.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < min; i++){
            sb.append(chars1[i]);
            sb.append(chars2[i]);
        }
        sb.append(longerString.substring(min));

        return sb.toString();

    }

}
