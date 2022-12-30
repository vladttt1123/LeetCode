package Easy.GroupB;

public class ValidPalindrome {
    // To solve this task need to iterate through String
    // as through array of chars, then save it to builder object
    // and put all through lowecase.
    //then use equals method to compare 2 Strings


    public boolean isPalindrome(String s) {
        //initalizing object of String Builder because it has a reverse method
        StringBuilder builder = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteredString = builder.toString();
        String reversedString = builder.reverse().toString();
        return filteredString.equals(reversedString);

        // Solution using Stream API, but I don't fully understand it yet
//        StringBuilder builder = new StringBuilder();
//        s.chars()
//                .filter(c -> Character.isLetterOrDigit(c))
//                .mapToObj(c -> Character.toLowerCase((char) c))
//                .forEach(builder::append);
//        return builder.toString().equals(builder.reverse().toString());
    }

}
