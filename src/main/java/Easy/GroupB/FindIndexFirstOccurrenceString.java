package Easy.GroupB;

public class FindIndexFirstOccurrenceString {

    public int strStr(String haystack, String needle) {

        // we need to take the whole needle
        // than try to apply the needle to the haystack
        // return the start index at which the needle entered haystack
        if (needle.isEmpty()) {
            return 0;
        }
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        haystack.indexOf(needle);

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            // haystack = "leetcode", needle = "leeto"
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
