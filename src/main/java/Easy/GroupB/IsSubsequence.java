package Easy.GroupB;

public class IsSubsequence {

    public static void main(String[] args) {
        // Test case 1
        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println(isSubsequence(s1, t1));  // Output: true
    }

    public static boolean isSubsequence(String s, String t) {

        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        System.out.println(sIndex);
        System.out.println(s.length());
        return sIndex == s.length();
    }
}
