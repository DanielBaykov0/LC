import static java.lang.Math.log10;

public class PowerOfThree {

    public static void main(String[] args) {

        int n = 45;

        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        }

        double x = log10(n)/log10(3);

        return x - (int) x == 0;
    }

    public static boolean powerThree(int n) {

        if (n > 0) {
            while (n > 0) {
                if (n % 3 == 0) {
                    n /= 3;
                } else if (n == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        return false;
    }
}
