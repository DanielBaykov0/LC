public class StrictlyPalindromicNumber {

    public static void main(String[] args) {

        int n = 9;
        System.out.println(isStrictlyPalindromic(n));
    }

    public static boolean isStrictlyPalindromic(int n) {

        for (int i = 2; i <= n; i++) {
            String s = Integer.toString(n, i);

            int start = 0;
            int end = s.length() - 1;
            while (start <= end / 2) {
                if (s.charAt(start) != s.charAt(end)) {
                    return false;
                }

                start++;
                end--;
            }
        }

        return true;
    }
}
