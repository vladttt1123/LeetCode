package Easy.GroupB;

public class Greatest_Common_Divisor_of_Strings_1071 {

    public String gcdOfStrings(String str1, String str2) {

        if(str2.length() > str1.length()){
            return gcdOfStrings(str2, str1);
        }

        if(str1.equals(str2)){
            return  str1;
        }
        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }

        return "";
    }

}
