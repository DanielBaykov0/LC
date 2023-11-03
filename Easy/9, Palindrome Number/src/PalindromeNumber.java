public class PalindromeNumber {

    public static void main(String[] args) {

        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {

        int rev = 0;
        int temp = x;

        while (x > 0) {
            int rem = x % 10;
            rev = (rev * 10) + rem;
            x /= 10;
        }

        return rev == temp;
    }
}
