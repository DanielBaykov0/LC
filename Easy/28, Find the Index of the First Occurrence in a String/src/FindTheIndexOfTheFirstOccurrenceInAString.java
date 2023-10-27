public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {

        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }

        return -1;
    }

    public int strStrWindow(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        int nIndex = 0;

        for (int i = 0; i < hLen; i++) {
            // as long as the characters are equal, increment needleIndex
            if (haystack.charAt(i) == needle.charAt(nIndex)) {
                nIndex++;
            } else {
                // start from the next index of previous start index
                i = i - nIndex;
                // needle should start from index 0
                nIndex = 0;
            }
            // check if needleIndex reached needle length
            if (nIndex == nLen) {
                // return the first index
                return i - nLen + 1;
            }
        }
        return -1;
    }

    public int strStrTwoPointer(String haystack, String needle) {
        int haylength = haystack.length();
        int needlelength = needle.length();

        if (haylength < needlelength) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
