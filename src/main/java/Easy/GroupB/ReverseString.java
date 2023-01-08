package Easy.GroupB;

public class ReverseString {

    public static void reverseString(char[] s) {

        int left = 0;
        int right = s.length -1;

        while(left < right){

            char temp = s[left];
            s[left++] = s[right];

            s[right--] = temp;

        }
        System.out.println(s);

    }

    public static void main(String[] args) {
        char[] charArray = {'h','e','l','l','o'};

        reverseString(charArray);
    }
}
