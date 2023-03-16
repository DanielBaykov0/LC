public class NumberOfGoodWaysToSplitAString {

    public static void main(String[] args) {

        String s = "aacaba";
        System.out.println(numSplits(s));
    }

    public static int numSplits(String s) {

        int[] left = new int[26];
        int[] right = new int[26];
        int l = 0;
        int r = 0;
        int count = 0;

        for (char c : s.toCharArray()) {
            if (right[c - 'a']++ == 0) {
                r++;
            }
        }

        for (char c : s.toCharArray()) {
            if (left[c - 'a']++ == 0) {
                l++;
            }

            if (--right[c - 'a'] == 0) {
                r--;
            }

            if (r == l) {
                count++;
            }
        }

        return count;
    }
}
