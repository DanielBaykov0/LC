public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {

        // we can solve the problem by extending from the middle
        String m = "";
        int longest = 0;

        // odd length
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > longest) {
                    longest = right - left + 1;
                    m = s.substring(left, right + 1);
                }

                left--;
                right++;
            }

            // even length
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > longest) {
                    longest = right - left + 1;
                    m = s.substring(left, right + 1);
                }

                left--;
                right++;
            }
        }

        return m;
    }
}
