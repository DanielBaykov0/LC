public class DivideTwoIntegers {

    public static void main(String[] args) {

        int dividend = 10;
        int divisor = 3;

        System.out.println(divide(dividend, divisor));
    }

    public static int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        //Corner case when -2^31 is divided by -1 will give 2^31 which doesn't exist so overflow

        boolean negative = dividend < 0 ^ divisor < 0;
        //Logical XOR will help in deciding if the results is negative only if any one of them is negative

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0, subQuot = 0;

        while (dividend - divisor >= 0) {
            for (subQuot = 0; dividend - (divisor << subQuot << 1) >= 0; subQuot++);
            quotient += 1 << subQuot; //Add to the quotient
            dividend -= divisor << subQuot; //Subtract from dividend to start over with the remaining
        }
        return negative ? -quotient : quotient;
    }
}
