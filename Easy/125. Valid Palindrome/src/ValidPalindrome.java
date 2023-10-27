public class ValidPalindrome {

    public static void main(String[] args) {

        String s = "Marge, let's \\\"[went].\\\" I await {news} telegram.";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !((s.charAt(left) >= 'a' && s.charAt(left) <= 'z') ||
                    (s.charAt(left) >= '0' && s.charAt(left) <= '9'))) {
                left++;
            }

            while (left < right && !((s.charAt(right) >= 'a' && s.charAt(right) <= 'z') ||
                    (s.charAt(right) >= '0' && s.charAt(right) <= '9'))) {
                right--;
            }

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static boolean isPalindrome2(String s) {
        if (s.isEmpty()) {
            return false;
        }

        int start = 0;
        int last = s.length() - 1;

        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);

            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {

                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }

        return true;
    }
}
