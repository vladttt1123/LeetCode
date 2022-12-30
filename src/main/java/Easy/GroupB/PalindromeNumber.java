package Easy.GroupB;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        int copyOfX = x;
        int revertedNumber = 0;

        while(copyOfX != 0){
            revertedNumber = revertedNumber * 10 + copyOfX % 10;

            copyOfX = copyOfX / 10;
        }

        return revertedNumber == x;


    }
}
