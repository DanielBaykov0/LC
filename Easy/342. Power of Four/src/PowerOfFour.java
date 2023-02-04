public class PowerOfFour {

    public static void main(String[] args) {

        int n = 1;

        System.out.println(isPowerOfFour(n));
    }

    public static boolean isPowerOfFour(int n) {

        double x = Math.log10(n) / Math.log10(4);

        return x - (int) x == 0;
    }
}
