public class FindThePivotInteger {

    public static void main(String[] args) {

        int n = 8;
        System.out.println(pivotInteger(n));
    }

    public static int pivotInteger(int n) {

        int lsum = 1;
        int rsum = n * (n + 1) / 2;

        if (n == 1) return 1;

        for (int i = 2; i <= n; i++) {
            lsum += i;
            rsum -= i - 1;

            if (lsum == rsum) {
                return i;
            }
        }

        return -1;
    }
}
